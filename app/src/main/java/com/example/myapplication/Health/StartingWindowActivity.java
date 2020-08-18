package com.example.myapplication.Health;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StartingWindowActivity extends AppCompatActivity {

    private List<User> userDate = new ArrayList<>();

    private Button saveBtn;
    private Button pressureInfoBtn;
    private Button vitalsInfoBtn;
    private Button cleanBtn;
    private EditText lastNameEtx;
    private EditText middleNameEtx;
    private EditText firstNameEtx;
    private EditText ageEtx;
    private TextView textView;
    private static final String TAG = "Мои записи";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_window);

        initViews();
    }

    private void initViews() {

        saveBtn = findViewById(R.id.save);
        pressureInfoBtn = findViewById(R.id.pressure);
        vitalsInfoBtn = findViewById(R.id.vitals);
        cleanBtn = findViewById(R.id.clean);
        lastNameEtx = findViewById(R.id.lastName);
        middleNameEtx = findViewById(R.id.middleName);
        firstNameEtx = findViewById(R.id.firstName);


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Нажатие кнопки Сохранить");

                ageEtx = findViewById(R.id.age);
                textView = findViewById(R.id.textView);

                try {
                    userDate.add(new User(lastNameEtx.getText().toString(), middleNameEtx.getText().toString(), firstNameEtx.getText().toString(), Integer.parseInt(ageEtx.getText().toString())));
                } catch (Exception ex) {
                    Log.e(TAG, "Получено исключение", ex);
                    Toast.makeText(StartingWindowActivity.this, R.string.message, Toast.LENGTH_LONG).show();
                }

                StringBuilder sb = new StringBuilder();
                for (User user : userDate) {
                    sb.append("Фамилия: \t").append(user.getLastName()).append("\n")
                            .append("Имя: \t").append(user.getMiddleName()).append("\n")
                            .append("Отчество: \t").append(user.getFirstName()).append("\n")
                            .append("Возраст: \t").append(user.getAge()).append("\n");
                }
                textView.setText(sb.toString());
            }
        });

        pressureInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Нажатие кнопки Давление (переход на другой экран)");
                Intent intent;
                intent = new Intent(StartingWindowActivity.this, InfoPressureActivity.class);
                startActivity(intent);
            }
        });

        vitalsInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Нажатие кнопки Жизненные показатели (переход на другой экран)");
                Intent intent;
                intent = new Intent(StartingWindowActivity.this, VitalsActivity.class);
                startActivity(intent);
            }
        });
        cleanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Нажатие кнопки очистить");
                try {
                    userDate.add(new User(lastNameEtx.getText().toString().trim(), middleNameEtx.getText().toString().trim(), firstNameEtx.getText().toString().trim(), Integer.parseInt(ageEtx.getText().toString().trim())));
                } catch (Exception ex) {
                    Log.e(TAG, "Получено исключение", ex);
                    Toast.makeText(StartingWindowActivity.this, R.string.messageClean, Toast.LENGTH_LONG).show();
                }
                lastNameEtx.setText("");
                middleNameEtx.setText("");
                firstNameEtx.setText("");
                ageEtx.setText("");
                textView.setText("");
            }
        });
    }
}
