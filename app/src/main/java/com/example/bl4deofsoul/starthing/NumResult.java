package com.example.bl4deofsoul.starthing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import Model.textPack;

public class NumResult extends AppCompatActivity {
    String convertNum(char str){
        if(str == 'ล'){
            return "lakkhana";
        }else if(str == '๑'){
            return "sun";
        }else if(str == '๒'){
            return "moon";
        }else if(str == '๓') {
            return "mars";
        }else if(str == '๔'){
            return "mercury";
        }else if(str == '๕'){
            return "jupiter";
        }else if(str == '๖'){
            return "venus";
        }else if(str == '๗'){
            return "saturn";
        }else if(str == '๘'){
            return "eclipse";
        }else if(str == '๙'){
            return "neptune";
        }else if(str == '๐'){
            return "uranus";
        }else{
            return null;
        }
    }

    protected void b2menu(View v){
        Intent i = new Intent(this,Main.class);
        startActivity(i);
        finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_result);
        textPack TP = getIntent().getParcelableExtra("TextList");
        TextView mrt = (TextView) findViewById(R.id.mrt);
        mrt.setText(printResult(TP));


    }
    String printResult(textPack TP){
        String[] tp = new String[12];
        int k = 0;
        for(String a : TP.textList){
            tp[k] = a;
            k++;
        }
        String[] zo = new String[12];
        zo[0] = "ARIES";
        zo[1] = "TAURUS";
        zo[2] = "GEMINI";
        zo[3] = "CANCER";
        zo[4] = "LEO";
        zo[5] = "VIRGO";
        zo[6] = "LIBRA";
        zo[7] = "SCORPIO";
        zo[8] = "SAGITARUIS";
        zo[9] = "CAPRICORNIUS";
        zo[10] = "AQUARIUS";
        zo[11] = "PISCES";
        String str = "";
        for(int i = 0;i<12;i++){
            if(!tp[i].equals("")){
                str += "Star on "+zo[0]+" consist of: ";
                for (int j = 0; j<tp[i].length();j++){
                    char a = tp[i].charAt(j);
                    str+= ", "+convertNum(tp[i].charAt(j));
                }
                str+=".\n";
            }
        }
        return str;
    }
}
