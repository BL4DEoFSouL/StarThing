package com.example.bl4deofsoul.starthing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class Main extends AppCompatActivity {
    protected void Fortell(View v){
        Intent a = new Intent(this,ForTellIndex.class);
        startActivity(a);
    }

    protected void num(View v){
        Intent a = new Intent(this,NumIndex.class);
        startActivity(a);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
