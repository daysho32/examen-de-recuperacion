package com.example.primerapregunta;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	public double v1, v2, v3;
	public EditText qv1, qv2, qv3;
	public TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        qv1 = (EditText) findViewById(R.id.qv1);
        qv2 = (EditText) findViewById(R.id.qv2);
        qv3 = (EditText) findViewById(R.id.qv3);
        respuesta = (TextView) findViewById(R.id.textView2);
    }
    public void CALCULAR(View view){
    	v1 = Double.parseDouble(qv1.getText().toString());
    	v2 = Double.parseDouble(qv2.getText().toString());
    	v3 = Double.parseDouble(qv3.getText().toString());
    	respuesta.setText(Double.toString(v1+v2+v3));
    }
    public void limpiar (View view){
    	qv1.setText("");
    	qv2.setText("");
    	qv3.setText("");
    	
    }


   
    
}
