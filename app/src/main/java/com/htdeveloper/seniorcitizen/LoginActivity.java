package com.htdeveloper.seniorcitizen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signUpNowTv(View view) {
        startActivity(new Intent(LoginActivity.this, SignupActivity.class));
    }

    public void loginBtn(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
