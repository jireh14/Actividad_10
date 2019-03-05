package com.example.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text_resultado;
    EditText edit_numero1;
    EditText edit_numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_numero1=(EditText)findViewById(R.id.edit_numero1);
        edit_numero2=(EditText)findViewById(R.id.edit_numero2);
        text_resultado= (TextView)findViewById(R.id.text_resultado);

    }
    public void suma (View v){
        float numero1 = Float.parseFloat(edit_numero1.getText().toString());
        float numero2 = Float.parseFloat(edit_numero2.getText().toString());
        float resultado = numero1 + numero2;
        text_resultado.setText(String.valueOf(resultado));
    }
    public void resta(View v){
        float numero1 = Float.parseFloat(edit_numero1.getText().toString());
        float numero2 = Float.parseFloat(edit_numero2.getText().toString());
        float resultado = numero1 - numero2;
        text_resultado.setText(String.valueOf(resultado));
    }
    public void division(View v){
        float numero1 = Float.parseFloat(edit_numero1.getText().toString());
        float numero2 = Float.parseFloat(edit_numero2.getText().toString());
        float resultado = numero1 / numero2;
        text_resultado.setText(String.valueOf(resultado));
    }
    public void multiplicacion(View v){
        float numero1 = Float.parseFloat(edit_numero1.getText().toString());
        float numero2 = Float.parseFloat(edit_numero2.getText().toString());
        float resultado = numero1 * numero2;
        text_resultado.setText(String.valueOf(resultado));
    }
    public void modulo(View v){
        float numero1 = Float.parseFloat(edit_numero1.getText().toString());
        float numero2 = Float.parseFloat(edit_numero2.getText().toString());
        float resultado = numero1 % numero2;
        text_resultado.setText(String.valueOf(resultado));
    }

}
