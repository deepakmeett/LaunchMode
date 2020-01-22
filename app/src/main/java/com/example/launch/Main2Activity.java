package com.example.launch;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Main2Activity extends AppCompatActivity {

    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        button5 = findViewById( R.id.buton5 );
        button6 = findViewById( R.id.buton6 );
        button7 = findViewById( R.id.buton7 );
        button8 = findViewById( R.id.buton8 );
        button5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main2Activity.this, MainActivity.class );
                startActivity( intent );
            }
        } );
        button6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main2Activity.this, Main2Activity.class );
                startActivity( intent );
            }
        } );
        button7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main2Activity.this, Main3Activity.class );
                startActivity( intent );
            }
        } );
        button8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main2Activity.this, Main4Activity.class );
                startActivity( intent );
            }
        } );
    }
}
