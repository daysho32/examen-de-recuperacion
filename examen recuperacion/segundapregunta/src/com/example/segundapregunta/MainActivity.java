package com.example.segundapregunta;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText cuadro1, cuadro2,cuadro3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cuadro1=(EditText)findViewById(R.id.editText1);
        cuadro2=(EditText)findViewById(R.id.editText2);
        cuadro3=(EditText)findViewById(R.id.editText3);
    }
    public void guardar (View view){
    	Toast.makeText(getApplicationContext(),"PERSONAL GUARDADO",Toast.LENGTH_LONG).show();
    }
    public void cancelar (View view){
    	cuadro1.setText("");
    	cuadro2.setText("");
    	cuadro3.setText("");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
