package com.example.diasdelasemana;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void LUNES(View view){
    	Toast.makeText(getApplicationContext(), "dia laborable", Toast.LENGTH_LONG).show();
    }
    public void MARTES(View view){
    	Toast.makeText(getApplicationContext(), "dia laborable", Toast.LENGTH_LONG).show();
    }
    public void MIERCOLES(View view){
    	Toast.makeText(getApplicationContext(), "dia laborable", Toast.LENGTH_LONG).show();
    }
    public void JUEVES(View view){
    	Toast.makeText(getApplicationContext(), "dia laborable", Toast.LENGTH_LONG).show();
    }
    public void VIERNES(View view){
    	Toast.makeText(getApplicationContext(), "dia laborable", Toast.LENGTH_LONG).show();
    }
    public void SABADO(View view){
    	Toast.makeText(getApplicationContext(), "dia no laborable", Toast.LENGTH_LONG).show();
    }
    public void DOMINGO(View view){
    	Toast.makeText(getApplicationContext(), "dia no laborable", Toast.LENGTH_LONG).show();
    }
}
