package com.example.nagamine.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private EditText editText2;
    private RadioButton radioButton;
    private RadioButton radioButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        textView=findViewById(R.id.textView);
        radioButton=findViewById(R.id.radioButton);
        radioButton2=findViewById(R.id.radioButton2);
    }
    public void operar (View view){
        long result;
        long n1 = Long.parseLong(editText.getText().toString());
        long n2 = Long.parseLong(editText2.getText().toString());
        if(radioButton.isChecked()) {
            result = n1 + n2;
        } else {
            result = n1 - n2;
        }
        textView.setText(String.valueOf(result));
    }
}
