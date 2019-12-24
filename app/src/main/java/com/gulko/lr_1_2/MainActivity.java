package com.gulko.lr_1_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.gulko.lr_1_2.firstLab.FirstActivity;
import com.gulko.lr_1_2.firstLab.SecondActivity;
import com.gulko.lr_1_2.secondLab.FirstTask;
import com.gulko.lr_1_2.secondLab.SecondTask;

import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    Button btnFirstTask, btnSecondTask, btnFirstTask2, btnSecondTask2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnFirstTask = findViewById(R.id.btnFirstTask);
        btnSecondTask = findViewById(R.id.btnSecondTask);

        btnFirstTask2 = findViewById(R.id.btnFirstTask2);
        btnSecondTask2 = findViewById(R.id.btnSecondTask2);

        btnFirstTask.setOnClickListener(view -> {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        });

        btnSecondTask.setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });

        btnFirstTask2 = findViewById(R.id.btnFirstTask2);
        btnSecondTask2 = findViewById(R.id.btnSecondTask2);
        btnFirstTask2.setOnClickListener(view -> {
            Intent intent = new Intent(this, FirstTask.class);
            startActivity(intent);
        });

        btnSecondTask2.setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondTask.class);
            startActivity(intent);
        });




    }



}
