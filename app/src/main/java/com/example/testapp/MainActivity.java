package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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
        //Colores y trazos con clases  Path y Color
    }

    //crear vista propia
    public class MyOwnView extends View{
        public MyOwnView(Context cntx){
            super( cntx );
        }

        @Override
        protected void onDraw(Canvas canvas){
            Paint pencil = new Paint(); //creamos pincel
            //pencil.setColor( Color.BLUE ); //tambien se puede poner en exadecimal
            //pencil.setColor(Color.argb(125, 167,222, 25)); //otra forma de dar color
            pencil.setStrokeWidth( 8 );
            pencil.setStyle( Paint.Style.FILL );

            //dibujar circulo con el pincel especificado
            canvas.drawCircle(175, 175, 100, pencil);
            //la mejor forma es manejar colores con recursos -> values/color.xml -> <color name="white">#FFFFFFFF</color>
            int myColor;
            myColor = ContextCompat.getColor(getContext(),R.color.white);
            pencil.setColor( myColor ); //color de recursos
        }
    }
}