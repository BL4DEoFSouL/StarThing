package com.example.l2ever5e.starthings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
/*    public Button NumToStar;
    public void init(){
        NumToStar = (Button)findViewById(R.id.NumToStar);
        NumToStar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent ChangePage = new Intent(MainActivity.this,ConvertNum.class);
                startActivity(ChangePage);
            }
        });
    }*/

    public void ChangePage(View v){
        Intent ChangePage = new Intent(MainActivity.this,ConvertNum.class);
        startActivity(ChangePage);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
