package com.company.durgaprasad.keyboardandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.button;


public class MainActivity extends AppCompatActivity {

    public void showText(View view){
        EditText editText = (EditText)findViewById(R.id.editText_main);
        if(editText != null){
            String showString = editText.getText().toString();
            Toast.makeText(MainActivity.this, showString, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
