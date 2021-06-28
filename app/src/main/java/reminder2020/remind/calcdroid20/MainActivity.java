package reminder2020.remind.calcdroid20;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; //для онклик
import android.widget.TextView; //для онклик
import java.util.Locale;
import android.widget.Button; // для лиссенера - способ 2

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    private TextView CalcOutput;
    private Counters counters;
//    private int counter1;
//    private int counter2;
//    private int counter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        // Получить пользовательский элемент по идентификатору
//        CalcOutput = findViewById(R.id.textView);
//        Button button2 = findViewById(R.id.button_2); //способ 2
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                counter2++;
//                CalcOutput.setText(String.format(Locale.getDefault(), "Нажата кнопка %s", 2)); //counter2 убрал, руками вписал 2
//            }
//        });
        counters = new Counters();
        initView();
    }

    private void initView() {
// Получить пользовательские элементы по идентификатору
        CalcOutput = findViewById(R.id.textView);

        initButton3ClickListener();
        initButton2ClickListener();
        initButton4ClickListener();

    }

    private void initButton3ClickListener() {
        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //counters.incrementCounter3();
                setTextCounter(CalcOutput, counters.getCounter3());
            }
        });

    }
    private void initButton2ClickListener() {
        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //counters.incrementCounter2();
                setTextCounter(CalcOutput, counters.getCounter2());
            }
        });

    }

    private void initButton4ClickListener(){
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
    private void setTextCounter(TextView textCounter, int counter){
        textCounter.setText(String.format(Locale.getDefault(), "%d", counter));
    }

    // Обработка кнопки через атрибут onClick в макете
    public void button_1_onClick(View view) {
        //counters.incrementCounter1();
        setTextCounter(CalcOutput, counters.getCounter1());
    }
    @Override
    public void onClick(View v) {
// Если на экране один пользовательский элемент, то такая обработка имеет смысл,
// но если на экране несколько элементов, здесь придется создавать "лишние" условия.
        switch (v.getId()) {
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