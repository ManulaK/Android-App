package com.example.loginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LifeCycle","invoked onCreate");

        edEmail = findViewById(R.id.edEmail);
    }
    public void login(View view){
        String email = edEmail.getText().toString();

        //Create Intent Object make connection between activities
        Intent intent = new Intent(this,DashBoardActivity.class);
        intent.putExtra("email",email);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle","invoked onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle","invoked onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle","invoked onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle","invoked onPause");
    }

    @Override
    protected void onDestroy() {
        Log.i("LifeCycle","invoked onDestroy");
        super.onDestroy();
    }
}