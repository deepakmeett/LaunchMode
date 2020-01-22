package com.example.launch;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Main3Activity extends AppCompatActivity {

    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
        button9 = findViewById( R.id.buton9 );
        button10 = findViewById( R.id.buton10 );
        button11 = findViewById( R.id.buton11 );
        button12 = findViewById( R.id.buton12 );
        
        button9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main3Activity.this, MainActivity.class );
                startActivity( intent );
            }
        } );
        button10.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main3Activity.this, Main2Activity.class );
                startActivity( intent );
            }
        } );
        button11.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main3Activity.this, Main3Activity.class );
                startActivity( intent );
            }
        } );
        button12.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main3Activity.this, Main4Activity.class );
                startActivity( intent );
            }
        } );
    }
}