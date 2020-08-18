package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UniversalActivity extends AppCompatActivity {

    private Button buttonOk;
    private TextView textView;
    private Button buttonClean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universal);

        init();
    }

    private void init() {

        buttonOk = findViewById(R.id.Ok);
        buttonClean = findViewById(R.id.clean);

        final EditText textLogin = (EditText) findViewById(R.id.personName);
        final EditText textEmail = (EditText) findViewById(R.id.email);
        final TextView output = (TextView) findViewById(R.id.output);

        output.setText("");

        buttonOk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if ((textEmail.getText().toString().equals("")) || (textLogin.getText().toString().equals(""))) {
                    output.setText(R.string.output);
                } else {
                    String result = getString(R.string.subscription1, textLogin.getText().toString(), textEmail.getText().toString());
                    output.setText(result);

                }
            }
        });

        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textEmail.setText("");
                textLogin.setText("");
                output.setText("");
            }
        });

    }
}
