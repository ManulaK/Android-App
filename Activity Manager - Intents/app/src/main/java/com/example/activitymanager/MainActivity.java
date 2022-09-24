package com.example.activitymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name1);

    }

    public void clickNext(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        String inputValue = name.getText().toString();
        intent.putExtra("Message",inputValue); //tag is used to identify the what is we are passing?
        startActivity(intent);
    }

}