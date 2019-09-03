package com.example.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v) {

            // getting a reference to my edit text fields
            EditText number1 = (EditText) findViewById(R.id.number1);
            EditText restaurant1 = (EditText) findViewById(R.id.restaurant1);
            EditText day1 = (EditText) findViewById(R.id.day1);
            EditText number2 = (EditText) findViewById(R.id.number2);
            EditText food1 = (EditText) findViewById(R.id.food1);
            // extracting the text from those edit text fields
            String number1Str = number1.getText().toString();
            String restaurant1Str = restaurant1.getText().toString();
            String day1Str = day1.getText().toString();
            String number2Str = number2.getText().toString();
            String food1Str = food1.getText().toString();
            // Creating the intent object so I can send data
            Intent intent = new Intent(this, MadLibText.class);
            // putting data from edit text fields into intent to send to other activity
            // MY_Name and MY_AGE are public constants in InfoActivity class
            intent.putExtra(MadLibText.NUMBER1, number1Str);
            intent.putExtra(MadLibText.RESTAURANT1, restaurant1Str);
            intent.putExtra(MadLibText.DAY1, day1Str);
            intent.putExtra(MadLibText.NUMBER2, number2Str);
            intent.putExtra(MadLibText.FOOD1, food1Str);
            Toast toast = Toast.makeText(getApplicationContext(), "Please input values into all text fields",
                Toast.LENGTH_SHORT);

            if(number1Str.length() == 0){
                toast.show();
            }
            else if(restaurant1Str.length() == 0){
                toast.show();
            }
            else if(day1Str.length() == 0){
                toast.show();
            }
            else if(number2Str.length() == 0){
                toast.show();
            }
            else if(food1Str.length() == 0){
                toast.show();
            }
            else {
                // loads the next activity
                startActivity(intent);
            }
    }
}
