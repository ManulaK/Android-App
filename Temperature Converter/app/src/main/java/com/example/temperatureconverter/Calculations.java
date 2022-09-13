package com.example.temperatureconverter;

public class Calculations {
    protected Float ConvertCelciusToFahrenheit(Float value){
        Float ans = (value * 9/5) + 32;
        return ans;
    }

    protected Float ConvertFahrenheitToCelcius(Float value){
         Float ans =(value - 32) * 5/9;
         return ans;
    }
}
