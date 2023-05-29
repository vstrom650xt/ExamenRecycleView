package com.example.examenrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
private   RecyclerView rc;

private FloatingActionButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rc = findViewById(R.id.rcv);
        btn = findViewById(R.id.floatingActionButton);

        MyAdapter adapter = new MyAdapter(this);
        rc.setAdapter(adapter);
        rc.setLayoutManager(new LinearLayoutManager(this));

        btn.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this,SecondActivty.class);
            startActivity(i);
        });
    }
}