package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOperation(View v){
        Intent i = new Intent(this, addClass.class);

        EditText numberOneText = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText numberTwoText = (EditText) findViewById(R.id.editTextTextPersonName2);

        int n1 = Integer.parseInt(numberOneText.getText().toString());
        int n2 = Integer.parseInt(numberTwoText.getText().toString());

        i.putExtra( "numberOne", n1);
        i.putExtra("numberTwo", n2);
        startActivity(i);
    }
}