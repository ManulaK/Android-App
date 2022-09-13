package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Button objBtn = findViewById(R.id.CalcualateBtn);
        objBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateAnswer();
            }
        });
    }

    private void calculateAnswer(){
        EditText editText =findViewById(R.id.txtBoxUserInput);
        Calculations calculations = new Calculations();
        RadioButton radioCelcius = findViewById(R.id.radioCelcius);
        RadioButton radioBtnFahrenheit = findViewById(R.id.radioBtnFahrenheit);
        TextView textView =findViewById(R.id.txtViewOutput);

        if (editText.getText().toString().isEmpty()){
            Toast.makeText(this,"You should add a value before calculate",Toast.LENGTH_LONG).show();
        }else {
            if (radioCelcius.isChecked()){
                textView.setText(String.valueOf(calculations.ConvertFahrenheitToCelcius(Float.valueOf(editText.getText().toString()))));
            }else if (radioBtnFahrenheit.isChecked()){
                textView.setText(String.valueOf(calculations.ConvertFahrenheitToCelcius(Float.valueOf(editText.getText().toString()))));
            }else if(!radioBtnFahrenheit.isChecked() && !radioCelcius.isChecked()){
                Toast.makeText(this,"You should select convertion type before calculate",Toast.LENGTH_LONG).show();
                
            }
        }
    }
}