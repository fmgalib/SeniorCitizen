package com.htdeveloper.seniorcitizen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menuIv(View view) {
    }

    public void feed(View view) {
        startActivity(new Intent(MainActivity.this, FeedActivity.class));
    }
}
