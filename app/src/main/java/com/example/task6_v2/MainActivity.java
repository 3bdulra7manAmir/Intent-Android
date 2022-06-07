package com.example.task6_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    int Number1, Number2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ET1 = findViewById(R.id.editTextNumber);
        EditText ET2 = findViewById(R.id.editTextNumber2);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Number1 = Integer.parseInt(ET1.getText().toString());
                Number2 = Integer.parseInt(ET2.getText().toString());

                Intent Switcher = new Intent(getApplicationContext(),MainActivity2.class);
            Bundle B_Obj = new Bundle();
            B_Obj.putInt("One",Number1);
            B_Obj.putInt("Two",Number2);
            Switcher.putExtras(B_Obj);
                startActivity(Switcher);

            }
        });

    }
}