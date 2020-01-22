package com.example.launch;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        button1 = findViewById( R.id.buton1 );
        button2 = findViewById( R.id.buton2 );
        button3 = findViewById( R.id.buton3 );
        button4 = findViewById( R.id.buton4 );
        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, MainActivity.class );
                startActivity( intent );
            }
        } );
        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, Main2Activity.class );
                startActivity( intent );
            }
        } );
        button3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, Main3Activity.class );
                startActivity( intent );
            }
        } );
        button4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, Main4Activity.class );
                startActivity( intent );
            }
        } );

    }
}
