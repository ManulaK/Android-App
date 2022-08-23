package com.example.loginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DashBoardActivity extends AppCompatActivity {

    TextView txtLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        Intent intent = getIntent();

        String email = intent.getStringExtra("email");
        txtLogin = findViewById(R.id.txtLogin);
        txtLogin.setText(getResources().getString(R.string.display_email,email));

    }
    public void openDialler(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("0719991761"));
        startActivity(intent);
    }
}