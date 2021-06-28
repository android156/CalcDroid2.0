package reminder2020.remind.calcdroid20;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView CalcOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Получить пользовательский элемент по идентификатору
        CalcOutput = findViewById(R.id.textView);
    }

    // Обработка кнопки через атрибут onClick в макете
    public void button_1_onClick(View view) {
        CalcOutput.setText(String.format(Locale.getDefault(), "Нажата кнопка %s", 1));
    }
}