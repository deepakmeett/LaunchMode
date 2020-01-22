package com.example.launch;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Main4Activity extends AppCompatActivity {

    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main4 );
        button13 = findViewById( R.id.buton13 );
        button14 = findViewById( R.id.buton14 );
        button15 = findViewById( R.id.buton15 );
        button16 = findViewById( R.id.buton16 );
        
        button13.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main4Activity.this, MainActivity.class );
                startActivity( intent );
            }
        } );
        button14.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main4Activity.this, Main2Activity.class );
                startActivity( intent );
            }
        } );
        button15.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main4Activity.this, Main3Activity.class );
                startActivity( intent );
            }
        } );
        button16.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Main4Activity.this, Main4Activity.class );
                startActivity( intent );
            }
        } );
    }
}