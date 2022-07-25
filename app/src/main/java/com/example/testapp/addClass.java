package com.example.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class addClass extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_layout);

        Bundle data = getIntent().getExtras();
        int numberOne = data.getInt("numberOne");
        int numberTwo = data.getInt("numberTwo");

        int add = numberOne + numberTwo;
        String addStr = "" + add;

        TextView result = (TextView) findViewById(R.id.resultText);
        result.setText( addStr );
    }
}
