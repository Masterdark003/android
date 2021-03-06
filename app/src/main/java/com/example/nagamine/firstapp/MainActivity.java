package com.example.nagamine.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private EditText editText2;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.spinner);
        String opciones[] = {"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adaptador);
    }

    public void operar(View view) {
        double result;
        double n1 = Double.parseDouble(editText.getText().toString());
        double n2 = Double.parseDouble(editText2.getText().toString());
        String valor = spinner.getSelectedItem().toString();
        try {
            if (valor.equals("sumar")) {
                result = n1 + n2;
            } else if (valor.equals("restar")) {
                result = n1 - n2;
            } else if (valor.equals("multiplicar")) {
                result = n1 * n2;
            } else {
                result = n1 / n2;
            }
            textView.setText(String.valueOf(result));
        } catch (ArithmeticException a) {
            textView.setText("ERROR");
        }

    }
}
