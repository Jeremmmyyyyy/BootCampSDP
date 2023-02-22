package com.example.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.mainButton);
        textView = findViewById(R.id.mainName);

        button.setOnClickListener(v -> {
            String str = textView.getText().toString();
            Intent intent = new Intent(MainActivity.this, GreetingActivity.class);
            intent.putExtra("name", str);
            startActivity(intent);
        });
    }

}