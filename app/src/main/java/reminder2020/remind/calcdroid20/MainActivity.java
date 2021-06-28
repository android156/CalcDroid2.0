package reminder2020.remind.calcdroid20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Output;
import android.os.Bundle;
import android.view.View; //для онклик
import android.widget.TextView; //для онклик
import java.util.Locale;
import android.widget.Button; // для лиссенера - способ 2
import android.os.Parcel;
import android.os.Parcelable;


public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
//    public MainActivity(String output) {
//        this.output = output;
//    }

    private String output;
//    private final static String SavedOutput = "Output";
    private TextView CalcOutput;
//    protected MainActivity (Parcel in){
//        this.output = in.readString();
//    }
    private Counters counters;

//    @Override
//    public int describeContents() {
//        return 0;
//    }
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(this.output);
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counters = new Counters();
        initView();
    }

//    // Сохранение данных
//    @Override
//    public void onSaveInstanceState(@NonNull Bundle instanceState) {
//        super.onSaveInstanceState(instanceState);
//        instanceState.putParcelable(SavedOutput, this);
//    }
//
//    @Override
//    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
//        super.onRestoreInstanceState(instanceState);
//        output = instanceState.getParcelable(SavedOutput);
//        setTextCounters();
//    }
//
//    // Отображение данных на экране
//    private void setTextCounters(){
//        setTextCounter(CalcOutput, counters.getCounter1());
//
//    }

    private void initView() {
// Получить пользовательские элементы по идентификатору
        CalcOutput = findViewById(R.id.textView);

//        initButton3ClickListener();
//        initButton2ClickListener();
        initButton4ClickListener();

    }

//    private void initButton3ClickListener() {
//        Button button3 = findViewById(R.id.button_3);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //counters.incrementCounter3();
//                setTextCounter(CalcOutput, counters.getCounter3());
//            }
//        });
//
//    }
//    private void initButton2ClickListener() {
//        Button button2 = findViewById(R.id.button_2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //counters.incrementCounter2();
//                setTextCounter(CalcOutput, counters.getCounter2());
//            }
//        });
//
//    }

    private void initButton4ClickListener(){
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);
        Button button0 = findViewById(R.id.button_0);
        Button button_point = findViewById(R.id.button_point);
        Button button_add = findViewById(R.id.button_add);
        Button button_mult = findViewById(R.id.button_mult);
        Button button_div = findViewById(R.id.button_div);
        Button button_sub = findViewById(R.id.button_sub);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
        button_mult.setOnClickListener(this);
        button_div.setOnClickListener(this);
    }
    // Установить текст на TextView
    private void setTextCounter(TextView textCounter, char counter){
        output = String.format(Locale.getDefault(), "%s%c", textCounter.getText(), counter);
        textCounter.setText(output);
    }

//    // Обработка кнопки через атрибут onClick в макете
//    public void button_1_onClick(View view) {
//        //counters.incrementCounter1();
//        setTextCounter(CalcOutput, counters.getCounter1());
//    }
    @Override
    public void onClick(View v) {
// Если на экране один пользовательский элемент, то такая обработка имеет смысл,
// но если на экране несколько элементов, здесь придется создавать "лишние" условия.
        switch (v.getId()) {
            case R.id.button_1:
                setTextCounter(CalcOutput, counters.getCounter1());
                break;
            case R.id.button_2:
                setTextCounter(CalcOutput, counters.getCounter2());
                break;
            case R.id.button_3:
                setTextCounter(CalcOutput, counters.getCounter3());
                break;
            case R.id.button_4:
                setTextCounter(CalcOutput, counters.getCounter4());
                break;
            case R.id.button_5:
                setTextCounter(CalcOutput, counters.getCounter5());
                break;
            case R.id.button_6:
                setTextCounter(CalcOutput, counters.getCounter6());
                break;
            case R.id.button_7:
                setTextCounter(CalcOutput, counters.getCounter7());
                break;
            case R.id.button_8:
                setTextCounter(CalcOutput, counters.getCounter8());
                break;
            case R.id.button_9:
                setTextCounter(CalcOutput, counters.getCounter9());
                break;
            case R.id.button_0:
                setTextCounter(CalcOutput, counters.getCounter0());
                break;
            case R.id.button_point:
                setTextCounter(CalcOutput, counters.getCounter_point());
                break;
            case R.id.button_mult:
                setTextCounter(CalcOutput, counters.getCounter_mlt());
                break;
            case R.id.button_add:
                setTextCounter(CalcOutput, counters.getCounter_add());
                break;
            case R.id.button_sub:
                setTextCounter(CalcOutput, counters.getCounter_sub());
                break;
            case R.id.button_div:
                setTextCounter(CalcOutput, counters.getCounter_div());
                break;
        }

    }


}