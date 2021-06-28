package reminder2020.remind.calcdroid20;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; //для онклик
import android.widget.TextView; //для онклик
import java.util.Locale;
import android.widget.Button; // для лиссенера - способ 2

public class MainActivity extends AppCompatActivity {

    private TextView CalcOutput;
//    private int counter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Получить пользовательский элемент по идентификатору
        CalcOutput = findViewById(R.id.textView);
        Button button2 = findViewById(R.id.button_2); //способ 2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                counter2++;
                CalcOutput.setText(String.format(Locale.getDefault(), "Нажата кнопка %s", 2)); //counter2 убрал, руками вписал 2
            }
        });
    }

    // Обработка кнопки через атрибут onClick в макете
    public void button_1_onClick(View view) {
        CalcOutput.setText(String.format(Locale.getDefault(), "Нажата кнопка %s", 1));
    }

}