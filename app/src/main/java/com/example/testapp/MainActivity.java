package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( new MyOwnView( this ) );
    }

    //crear vista propia
    public class MyOwnView View{
        public MyOwnView(Context cntx){
            super( cntx );
        }

        @Override
        protected void onDraw(Canvas canvas){
            Paint pencil = new Paint();
            pencil.setColor( Color.BLUE );
            pencil.setStrokeWidth( 8 );
            pencil.setStyle( Paint.Style.FILL );

            canvas.drawCircle(175, 175, 100, pencil);
        }
    }
}