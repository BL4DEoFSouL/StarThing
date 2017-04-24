package com.example.bl4deofsoul.starthing;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import Model.DOYandYEAR;
import Model.integerclass;

public class ForTellIndex extends AppCompatActivity {
    //Spinner List
    private Spinner monthSpinner;
    private Spinner dateSpinner;
    private Spinner yearSpinner;
    //Array
    private ArrayList<String> Monthlist = new ArrayList<String>();
    private ArrayList<String> Datelist = new ArrayList<String>();
    private ArrayList<String> Yearlist = new ArrayList<String>();
    private void addMonth(){
        Monthlist.add("MM");
        for(int i = 1;i<=12;i++){
            Monthlist.add(Integer.toString(i));
        }
    }
    private void addDate(){
        Datelist.add("DD");
        for(int i = 1;i<=31;i++){
            Datelist.add(Integer.toString(i));
        }
    }
    private void addYear(){
        Yearlist.add("YY");
        for(int i = Calendar.getInstance().get(Calendar.YEAR)-100;i<=Calendar.getInstance().get(Calendar.YEAR);i++){
            Yearlist.add(Integer.toString(i));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_tell_index);
        monthSpinner = (Spinner)findViewById(R.id.monthSpinner);
        addMonth();
        ArrayAdapter<String> mm = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Monthlist);
        monthSpinner.setAdapter(mm);
        dateSpinner = (Spinner)findViewById(R.id.dateSpinner);
        addDate();
        ArrayAdapter<String> dd = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Datelist);
        dateSpinner.setAdapter(dd);
        yearSpinner = (Spinner)findViewById(R.id.yearSpinner);
        addYear();
        ArrayAdapter<String> yy = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Yearlist);
        yearSpinner.setAdapter(yy);

    }

    //Button implement
    protected void fortellSubmit(View v){
        try{
            int date = Integer.parseInt(dateSpinner.getSelectedItem().toString());
            int month = Integer.parseInt(monthSpinner.getSelectedItem().toString());
            int year = Integer.parseInt(yearSpinner.getSelectedItem().toString());
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String dateInString = date+"/"+month+"/"+year;
            Calendar cal  = Calendar.getInstance();
            cal.setTime(formatter.parse(dateInString));
            TextView a = (TextView)findViewById(R.id.TestText);
            int dayOfYear = cal.get(cal.DAY_OF_YEAR);
            a.setText(Integer.toString(dayOfYear));
            //intent
            DOYandYEAR DAY = new DOYandYEAR(dayOfYear,year);
            Intent i = new Intent(this,fortellResult.class);
            i.putExtra("DAY",DAY);
            startActivity(i);


        }catch(Exception e){
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("wrong input");
            dlgAlert.setTitle("Error Message...");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();
        }

    }
}
