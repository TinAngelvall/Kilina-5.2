package com.example.myapplication.Health;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class InfoPressureActivity extends AppCompatActivity {

    private List<InfoPressureList> userPressure = new ArrayList<>();
    private Button saveBtn;
    private Button cleanBtn;
    private EditText upperPressureEtx;
    private EditText lowerPressureEtx;
    private EditText pulseEtx;
    private EditText tachycardiaEtx;
    private EditText dataEtx;
    private TextView textView;
    private static final String TAG = "Мои записи";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pressure);

        initViews();
    }

    private void initViews() {

        Calendar calendar = new GregorianCalendar();

        saveBtn = findViewById(R.id.save);
        cleanBtn = findViewById(R.id.clean);
        upperPressureEtx = findViewById(R.id.upperPressure);
        lowerPressureEtx = findViewById(R.id.lowerPressure);
        pulseEtx = findViewById(R.id.pulse);
        tachycardiaEtx = findViewById(R.id.tachycardia);
        dataEtx = findViewById(R.id.data);
        textView = findViewById(R.id.textView);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Нажатие кнопки Сохранить");
                try {
                    userPressure.add(new InfoPressureList(
                            Integer.parseInt(upperPressureEtx.getText().toString()),
                            Integer.parseInt(lowerPressureEtx.getText().toString()),
                            Integer.parseInt(pulseEtx.getText().toString()),
                            Integer.parseInt(tachycardiaEtx.getText().toString()),
                            Integer.parseInt(dataEtx.getText().toString())));
                } catch (Exception ex) {
                    Toast.makeText(InfoPressureActivity.this, R.string.message, Toast.LENGTH_LONG).show();
                    Log.e(TAG, "Ошибка при вводе значений давления");
                }

                StringBuilder sb = new StringBuilder();

                for (InfoPressureList infoPressureList : userPressure) {
                    sb.append("Верхнее давление:\t").append(infoPressureList.getUpperPressure()).append("\n")
                            .append("Нижнее давление:\t").append(infoPressureList.getLowerPressure()).append("\n")
                            .append("Пульс:\t").append(infoPressureList.getPulse()).append("\n")
                            .append("Тахикария:\t").append(infoPressureList.getTachycardia()).append("\n")
                            .append("Дата замера:\t").append(infoPressureList.getDate()).append("\n");
                }
                textView.setText(sb.toString());
            }
        });
        cleanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Нажатие кнопки Очистить");
                try {
                    userPressure.add(new InfoPressureList(
                            Integer.parseInt(upperPressureEtx.getText().toString()),
                            Integer.parseInt(lowerPressureEtx.getText().toString()),
                            Integer.parseInt(pulseEtx.getText().toString()),
                            Integer.parseInt(tachycardiaEtx.getText().toString()),
                            Integer.parseInt(dataEtx.getText().toString())));
                } catch (Exception ex) {
                    Toast.makeText(InfoPressureActivity.this, R.string.messageClean, Toast.LENGTH_LONG).show();
                    Log.e(TAG, "Ошибка при вводе значений давления");
                }
                upperPressureEtx.setText("");
                lowerPressureEtx.setText("");
                pulseEtx.setText("");
                tachycardiaEtx.setText("");
                dataEtx.setText("");
            }
        });
    }
}