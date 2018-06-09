package com.example.nagamine.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        textView=findViewById(R.id.textView);
    }
    public void sumar (View view){
        long n1 = Long.parseLong(editText.getText().toString());
        long n2 = Long.parseLong(editText2.getText().toString());
        long suma = n1+n2;
        textView.setText(String.valueOf(suma));
    }
}
