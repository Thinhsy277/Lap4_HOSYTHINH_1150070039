package com.example.a1150070039_hosythinh_lap4teoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // phải là public, void và nhận tham số View
    public void onBtnHelloClick(View v) {
        startActivity(new Intent(this, HelloActivity.class));
    }

    public void onBtnRegisterClick(View v) {
        startActivity(new Intent(this, RegisterActivity.class));
    }
}