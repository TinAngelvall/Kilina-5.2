package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.myapplication.Health.StartingWindowActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_open_notes:

                Toast.makeText(MainActivity.this, "Отркыть записную книжку", Toast.LENGTH_LONG).show();

                Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intentNotes);

                return true;

            case R.id.action_open_checkBox:

                Toast.makeText(MainActivity.this, "Отркыть взаимоисключающие checkBox", Toast.LENGTH_LONG).show();

                Intent intentCheckBox = new Intent(MainActivity.this, CheckBoxActivity.class);
                startActivity(intentCheckBox);
                return true;

            case R.id.action_open_spinner:

                Toast.makeText(MainActivity.this, "Отркыть Страны-города-улицы", Toast.LENGTH_LONG).show();

                Intent intentSpinner = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(intentSpinner);

                return true;

            case R.id.action_open_calendarView:

                Toast.makeText(MainActivity.this, "Отркыть календарь 'Сроки задачи'", Toast.LENGTH_LONG).show();

                Intent intentCalendar = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intentCalendar);
                return true;

            case R.id.action_open_health:

                Toast.makeText(MainActivity.this, "Отркыть систему мониторинга здоровья", Toast.LENGTH_LONG).show();

                Intent intentHealth = new Intent(MainActivity.this, StartingWindowActivity.class);
                startActivity(intentHealth);
                return true;

            case R.id.action_infiniteTransition:

                Toast.makeText(MainActivity.this, "Бесконечный переход", Toast.LENGTH_LONG).show();

                Intent intentTransition = new Intent(MainActivity.this, InfiniteTransitionActivity.class);
                startActivity(intentTransition);
                return true;
            case R.id.action_universal_input_form:

                Toast.makeText(MainActivity.this, "Универсальная форма ввода", Toast.LENGTH_LONG).show();

                Intent intentInputForm = new Intent(MainActivity.this, UniversalActivity.class);
                startActivity(intentInputForm);
                return true;
            case R.id.helloWorld:

                Toast.makeText(MainActivity.this, "Собственный Hello World!", Toast.LENGTH_LONG).show();

                Intent intentHello = new Intent(MainActivity.this, SplashScreenActivity.class);
                startActivity(intentHello);
                return true;
            case R.id.firstProject:

                Toast.makeText(MainActivity.this, "Первый проект", Toast.LENGTH_LONG).show();

                Intent intentFirst = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intentFirst);
                return true;
            case R.id.exit:

                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);


        }

    }
}