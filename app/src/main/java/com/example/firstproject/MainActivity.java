package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view){
        TextView textHello = findViewById(R.id.textView);
        EditText editTextName = findViewById(R.id.editFirstName);
        textHello.setText("Hello " + editTextName.getText().toString());

        //TextView firstName = findViewById(R.id.)
    }
}