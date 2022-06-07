package com.example.task6_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity
{

    int Number1, Number2, Result1, Result2 = 1, Result4;
    double Result3 = 1.0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView SummationTV = findViewById(R.id.textView2);
        TextView MultiplicationTV = findViewById(R.id.textView4);
        TextView DivisionTV = findViewById(R.id.textView6);
        TextView SubtractionTV = findViewById(R.id.textView8);

        Bundle B_Obj = getIntent().getExtras();
        Number1 = B_Obj.getInt("One");
        Number2 = B_Obj.getInt("Two");

        int Temp = Number1;
        while (Number1  <= Number2) //1   //4
        {
            Result1+= Number1;
            Number1++;
        }
        SummationTV.setText(String.valueOf(Result1));

        Number1 = Temp;
        while (Number1 <= Number2)
        {
            Result2*= Number1;
            Number1++;
        }
        MultiplicationTV.setText(String.valueOf(Result2));

        Number1 = Temp;
        while (Number1 <= Number2)
        {
            Result3/= Number1;
            Number1++;
        }
        DivisionTV.setText(String.valueOf(Result3));

        Number1 = Temp;
        while (Number2 >= Number1)
        {
            Result4-= Number2;
            Number2--;
        }
        SubtractionTV.setText(String.valueOf(Result4));

    }
}