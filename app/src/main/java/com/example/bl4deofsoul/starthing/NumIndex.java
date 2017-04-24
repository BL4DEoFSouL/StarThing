package com.example.bl4deofsoul.starthing;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import Model.textPack;

public class NumIndex extends AppCompatActivity {
    ArrayList<String> lknList = new ArrayList<String>();
    Spinner s1;
    Spinner s2;
    Spinner s3;
    Spinner s4;
    Spinner s5;
    Spinner s6;
    Spinner s7;
    Spinner s8;
    Spinner s9;
    Spinner s10;
    Spinner s11;
    Spinner s12;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;
    TextView t10;
    TextView t11;
    TextView t12;



//    void setSpinnerListerner(Spinner s,TextView t){
//        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if(s.getSelectedItemPosition() == 0){
//
//                }else if(s.getSelectedItemPosition() == 1){
//                    if(t.getText() == ""){
//
//                    }else{
//                        String str = t.getText();
//                        str.substring(0,str.length()-1);
//                        t.setText(str);
//                    }
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                //Do Nothing
//            }
//        });
//    }
    void lknAddList(){
        lknList.add("");
        lknList.add("<");
        lknList.add("ล");
        lknList.add("๑");
        lknList.add("๒");
        lknList.add("๓");
        lknList.add("๔");
        lknList.add("๕");
        lknList.add("๖");
        lknList.add("๗");
        lknList.add("๘");
        lknList.add("๙");
        lknList.add("๐");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_index);

        //reset Text
         t1 = (TextView)findViewById(R.id.t1);
         t2 = (TextView)findViewById(R.id.t2);
         t3 = (TextView)findViewById(R.id.t3);
         t4 = (TextView)findViewById(R.id.t4);
         t5 = (TextView)findViewById(R.id.t5);
         t6 = (TextView)findViewById(R.id.t6);
         t7 = (TextView)findViewById(R.id.t7);
         t8 = (TextView)findViewById(R.id.t8);
         t9 = (TextView)findViewById(R.id.t9);
         t10 = (TextView)findViewById(R.id.t10);
         t11 = (TextView)findViewById(R.id.t11);
         t12 = (TextView)findViewById(R.id.t12);
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        t10.setText("");
        t11.setText("");
        t12.setText("");




        //add text to spinner
        lknAddList();
        ArrayAdapter<String> lknl = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,lknList);
         s1 = (Spinner) findViewById(R.id.s1);
        s1.setAdapter(lknl);
         s2 = (Spinner) findViewById(R.id.s2);
        s2.setAdapter(lknl);
         s3 = (Spinner) findViewById(R.id.s3);
        s3.setAdapter(lknl);
         s4 = (Spinner) findViewById(R.id.s4);
        s4.setAdapter(lknl);
         s5 = (Spinner) findViewById(R.id.s5);
        s5.setAdapter(lknl);
         s6 = (Spinner) findViewById(R.id.s6);
        s6.setAdapter(lknl);
         s7 = (Spinner) findViewById(R.id.s7);
        s7.setAdapter(lknl);
         s8 = (Spinner) findViewById(R.id.s8);
        s8.setAdapter(lknl);
         s9 = (Spinner) findViewById(R.id.s9);
        s9.setAdapter(lknl);
         s10 = (Spinner) findViewById(R.id.s10);
        s10.setAdapter(lknl);
         s11 = (Spinner) findViewById(R.id.s11);
        s11.setAdapter(lknl);
         s12 = (Spinner) findViewById(R.id.s12);
        s12.setAdapter(lknl);

        setListener();


    }

    protected void numSubmit(View v){
        textPack textList = new textPack();
        textList.textList.add(t1.getText().toString());
        textList.textList.add(t2.getText().toString());
        textList.textList.add(t3.getText().toString());
        textList.textList.add(t4.getText().toString());
        textList.textList.add(t5.getText().toString());
        textList.textList.add(t6.getText().toString());
        textList.textList.add(t7.getText().toString());
        textList.textList.add(t8.getText().toString());
        textList.textList.add(t9.getText().toString());
        textList.textList.add(t10.getText().toString());
        textList.textList.add(t11.getText().toString());
        textList.textList.add(t12.getText().toString());
        int notnull = 0;
        for(String a:textList.textList){
            if(!a.equals("")){
                notnull++;
                break;
            }
        }
        if(notnull != 0){
            Intent i = new Intent(this,NumResult.class);
            i.putExtra("TextList",textList);
            startActivity(i);
        }else{
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("wrong input");
            dlgAlert.setTitle("Must input atleast one...");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();
        }

    }

    void setListener(){
        //1
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s1.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s1.getSelectedItemPosition() == 1){

                    String str = t1.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t1.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t1.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s1.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t1.setText(t1.getText().toString()+s1.getSelectedItem().toString());
                    }
                }
                s1.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //2
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s2.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s2.getSelectedItemPosition() == 1){

                    String str = t2.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t2.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t2.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s2.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t2.setText(t2.getText().toString()+s2.getSelectedItem().toString());
                    }
                }
                s2.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //3
        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s3.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s3.getSelectedItemPosition() == 1){

                    String str = t3.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t3.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t3.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s3.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t3.setText(t3.getText().toString()+s3.getSelectedItem().toString());
                    }
                }
                s3.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //4
        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s4.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s4.getSelectedItemPosition() == 1){

                    String str = t4.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t4.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t4.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s4.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t4.setText(t4.getText().toString()+s4.getSelectedItem().toString());
                    }
                }
                s4.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //5
        s5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s5.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s5.getSelectedItemPosition() == 1){

                    String str = t5.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t5.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t5.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s5.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t5.setText(t5.getText().toString()+s5.getSelectedItem().toString());
                    }
                }
                s5.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //6
        s6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s6.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s6.getSelectedItemPosition() == 1){

                    String str = t6.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t6.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t6.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s6.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t6.setText(t6.getText().toString()+s6.getSelectedItem().toString());
                    }
                }
                s6.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //7
        s7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s7.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s7.getSelectedItemPosition() == 1){

                    String str = t7.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t7.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t7.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s7.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t7.setText(t7.getText().toString()+s7.getSelectedItem().toString());
                    }
                }
                s7.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //8
        s8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s8.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s8.getSelectedItemPosition() == 1){

                    String str = t8.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t8.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t8.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s8.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t8.setText(t8.getText().toString()+s8.getSelectedItem().toString());
                    }
                }
                s8.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //9
        s9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s9.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s9.getSelectedItemPosition() == 1){

                    String str = t9.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t9.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t9.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s9.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t9.setText(t9.getText().toString()+s9.getSelectedItem().toString());
                    }
                }
                s9.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //10
        s10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s10.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s10.getSelectedItemPosition() == 1){

                    String str = t10.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t10.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t10.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s10.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t10.setText(t10.getText().toString()+s10.getSelectedItem().toString());
                    }
                }
                s10.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //11
        s11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s11.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s11.getSelectedItemPosition() == 1){

                    String str = t11.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t11.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t11.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s11.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t11.setText(t11.getText().toString()+s11.getSelectedItem().toString());
                    }
                }
                s11.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //12
        s12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(s12.getSelectedItemPosition() == 0){
                    //do nothing
                }else if(s12.getSelectedItemPosition() == 1){

                    String str = t12.getText().toString();
                    String deStr = "";
                    for (int i = 0;i<str.length()-1;i++){
                        deStr+=str.charAt(i);
                    }
                    t12.setText(deStr);

                }else{
                    //check duplicate word
                    String str = t12.getText().toString();
                    int dup = 0;
                    for(int i = 0;i< str.length();i++){
                        if(s12.getSelectedItem().toString().charAt(0) ==str.charAt(i)){
                            dup++;
                            break;
                        }
                    }
                    if(dup == 0){
                        t12.setText(t12.getText().toString()+s12.getSelectedItem().toString());
                    }
                }
                s12.setSelection(0);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
