package com.example.activitymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Intent intent;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intent = getIntent();
        String name = intent.getStringExtra("Message");
        textView = findViewById(R.id.disName);
        textView.setText(name);
    }
    public void clickNext(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}