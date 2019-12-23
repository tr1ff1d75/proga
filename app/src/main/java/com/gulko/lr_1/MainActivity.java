package com.gulko.lr_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.gulko.lr_1.firstLab.FirstActivity;
import com.gulko.lr_1.firstLab.SecondActivity;

import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    Button btnFirstTask, btnSecondTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnFirstTask = findViewById(R.id.btnFirstTask);
        btnSecondTask = findViewById(R.id.btnSecondTask);
        btnFirstTask.setOnClickListener(view -> {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        });

        btnSecondTask.setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });
    }



}
