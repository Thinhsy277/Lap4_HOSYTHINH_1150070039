package com.example.a1150070039_hosythinh_lap4teoapp; // <-- đúng y chang package của MainActivity

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello); // trỏ tới activity_hello.xml
    }
}