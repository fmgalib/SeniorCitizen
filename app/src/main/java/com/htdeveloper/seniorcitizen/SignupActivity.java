package com.htdeveloper.seniorcitizen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SignupActivity extends AppCompatActivity {

    private EditText dobEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        init();


    }

    private void init() {
        dobEt = findViewById(R.id.dobEt);
    }

    public void loginNowTv(View view) {
        startActivity(new Intent(SignupActivity.this, LoginActivity.class));
    }

    public void dobEt(View view) {
        DatePickerDialog.OnDateSetListener dateSetListener =
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                        month = month + 1;

                        String currentDate = year+"/"+month+"/"+day;

                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

                        Date date = null;

                        try {
                            date = dateFormat.parse(currentDate);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                        dobEt.setText(dateFormat.format(date));
                        long millisec = date.getTime();
                    }
                };

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog datePickerDialog = new DatePickerDialog(SignupActivity.this, dateSetListener, year, month, day);
        datePickerDialog.show();
    }
}
