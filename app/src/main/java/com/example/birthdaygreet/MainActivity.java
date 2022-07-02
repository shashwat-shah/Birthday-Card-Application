package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
EditText editText;
public static final String EXTRA_NAME="com.example.birthdaygreet.name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String name = editText.getText().toString();
//                Toast.makeText(MainActivity.this, "Name is: "+name, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Card Generated Successfully", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getBaseContext(),GreetingActivity.class);
                String name=editText.getText().toString();
                intent.putExtra(EXTRA_NAME,name);
                startActivity(intent);

            }
        });
    }
//String name=editText.getText().toString();
//    public void Createbirthdaycard(View view) {
//        Toast.makeText(MainActivity.this, "Name is: "+name, Toast.LENGTH_SHORT).show();
//    }
}