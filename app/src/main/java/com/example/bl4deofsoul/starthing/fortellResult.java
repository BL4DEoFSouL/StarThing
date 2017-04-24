package com.example.bl4deofsoul.starthing;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Model.DOYandYEAR;
import Model.ZodiacObj;

public class fortellResult extends AppCompatActivity {
    //String address = "http://localhost/Zodiac/getAllData.php";
    ArrayList<ZodiacObj> zodiacList = new ArrayList<ZodiacObj>();

    void createFortell(){
        String[] DesText = new String[12];
        DesText[11] = "\"The Capricorn horoscope 2017 predicts that armed with the desire to explore all the potential that is hidden inside you, that Saturn is going to show you in 2017, you can create positive change in every area of your life, especially as you have assistance from Pluto who just loves it when we commit to transformation.\" \n" +
                "                \"For those of Capricorn born at the start of the second week of January, you will feel the effects of Pluto more than most Capricorns, as he will be impacting on your Sun Sign. During this year, he will stir up your deepest fears and hidden feelings, secrets – including those you keep from yourself, and also, along with Saturn’s workings in your 12th sector, uncover those hidden talents. Don’t try to \"";
        DesText[10] ="\"According to Sagittarius horoscope 2017, get ready for a fated year, Sagittarius! Don’t you love those stories which begin ‘It is written . . .’? Where is it written? In the stars of course! You have a 2017 year where fate takes over and yes, it is written that you have these experiences. Open a new page in your Book of Destiny, Sagittarius. In 2017, make your money work for you over the long term. Love and other encounters have a fated feel.\"";
        DesText[9] = "Hello fabulous one! The Scorpio horoscope 2017 shows that your best cycle for 12 years begins! Breathtaking events in love, travel and expansion take you skyward! Get ready for a year of destiny as 2017 will take you on a fabulous journey where larger than life and breathtaking experiences open doors, new horizons and turn you into an attraction magnet!";
        DesText[8] = "The Libra horoscope 2017 shows that you enter a ‘no limits’ year when anything is possible! Have confidence in your decisions and know thyself in 2017.\n" +
                "\n" +
                "As a Libra, you look for balance, harmony and justice in the world around you. You’re known for having a tough time making up your mind because of your ability to see all sides of an argument.";
        DesText[7] = "The Virgo horoscope 2017 says that practical, well organized and an absolute perfectionist would be the caption under your picture in the high school yearbook. You’ve got an eye for detail and a special place in your heart for efficiency. That Virgo mind of yours is always whirring along and makes you critical, picky and analytical. You’ll put that extra splash of effort and time in to get things just right.";
        DesText[6] = "The Leo horoscope 2017 points out that is time for that serious love and serious commitment and to create a starring role for yourself. Generous, warm and full of life, you’re a natural-born leader, Leo, with an excellent sense of loyalty and dignity.";
        DesText[5] = "The Cancer Horoscope 2017 shows that as the sign of home and family, you have strong emotional ties even if you don’t always like to admit to it. Only when you feel secure with your environment are you able to take life in to the fullest. In 2017, trust in the power of love and journey back to where you truly belong.\n" +
                "\n" +
                "You’re caring and compassionate and can throw some killer dinner parties. That’s where it’s at for you: being with loved ones without having to leave the comfort of your cozy home. While you’re known for your culinary skill and your tender hospitality, you can also be quite moody and hide in your shell when you’re the least bit miffed. At times, you may appear to have a tough exterior, but deep down inside, you really do have a soft spot.";
        DesText[4] = "The Gemini horoscope 2017 predicts that romance will be on your mind this year. In 2017, love moves as fast as Cupid’s arrow. You’re okay with flirting for fun, but also you’re looking for something more substantial. You’re eager to partner up with someone and make a long-term commitment. This attachment attraction could be a new feeling for you.";
        DesText[3] = "The Taurus horoscope 2017 predicts that this year the work opportunities expand. 2017 is a year to take care of that body – and love it more!\n" +
                "\n" +
                "The 2017 forecast for Taurus also shows that with transiting Uranus in your solar 12th house there appears to be some type of behind the scenes activity going on or events that you don’t want others to know about. You may be secretly doing things that are very unusual and behind the scenes. You may be planning some type of life that will give you more freedom in your life in the future. You may be flexing your independence while out of the public eye, spreading your wings in private, while continuing to play a role you think the world expects of you–sort of like leading a double life.";
        DesText[2] = "The Aries horoscope 2017 offers key opportunities which light up with potential for you. The main areas which shine throughout the year are going to be partnerships and also your long term career. So focus your energy here as you have the planets – including ruler Mars very much on your side this year. Aries, in 2017, explore just how fulfilling togetherness can be, your best love cycle for 12 years began last year. Expect growth and recognition with your career in 2017.";
        DesText[1] = "The Pisces horoscope 2017 shows that for you will begin a year of travel and exploration. Jupiter, the Planet of Good Luck and Fortune, moves into your sector of long-distance connections and travel during October. These three months are the best for you to travel.\n" +
                "\n" +
                "Love enters the hot zone and some unexpected issues may arise involving money. You can always plan for the future and try to be as prepared as possible, but something may happen that will be beyond your control.";
        DesText[0] = "The Aquarius horoscope 2017 shows that this year the career opportunities bring recognition and travel. You have all you need within to manifest your desires. Increased self-love brings in the love you’re seeking from others.";




        //add list
        zodiacList.add(new ZodiacObj("Capricorn",356,357,"December 22 – January 19",DesText[11],R.drawable.capricorn));

        zodiacList.add(new ZodiacObj("Sagittarius",326,327,"November 22 – December 21",DesText[10],R.drawable.sagittarius));
        zodiacList.add(new ZodiacObj("Scorpio",296,297,"October 23 – November 21",DesText[9],R.drawable.scorpio));
        zodiacList.add(new ZodiacObj("Libra",266,267,"September 23 – October 22",DesText[8],R.drawable.libra));
        zodiacList.add(new ZodiacObj("Virgo",235,236,"August 23 – September 22",DesText[7],R.drawable.virgo));
        zodiacList.add(new ZodiacObj("Leo",204,205,"July 23 -August 22",DesText[6],R.drawable.leo));
        zodiacList.add(new ZodiacObj("Cancer",172,173,"June 21 – July 22",DesText[5],R.drawable.cancer));
        zodiacList.add(new ZodiacObj("Gemini",141,142,"May 21 – June 21",DesText[4],R.drawable.gemini));
        zodiacList.add(new ZodiacObj("Taurus",110,111,"April 20 – May 20",DesText[3],R.drawable.taurus));
        zodiacList.add(new ZodiacObj("Aries",80,81,"March 21 to April 19",DesText[2],R.drawable.aries));
        zodiacList.add(new ZodiacObj("Pisces",50,50,"February 19- March 20",DesText[1],R.drawable.pisces));
        zodiacList.add(new ZodiacObj("Aquarius",20,20,"January 20 – February 18",DesText[0],R.drawable.aquarius));
    }

    protected void toMenu(View v){
        Intent a = new Intent(this,Main.class);
        startActivity(a);
        finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortell_result);
        ZodiacObj a = new ZodiacObj();
        DOYandYEAR DAY = getIntent().getParcelableExtra("DAY");
        createFortell();
        if(DAY.year%4 == 0 && DAY.year%100 != 0){
            for(ZodiacObj temp:zodiacList){
                if(DAY.DOY>temp.startDate366 || DAY.DOY < 20){
                    a = temp;
                    break;
                }
            }
        }else{
            for(ZodiacObj temp:zodiacList){
                if(DAY.DOY>temp.startDate365 || DAY.DOY < 20){
                    a = temp;
                    break;
                    }
                }
        }

        //show part
        TextView title = (TextView) findViewById(R.id.title);
        ImageView image = (ImageView) findViewById(R.id.image);
        Bitmap bMap = BitmapFactory.decodeResource(getResources(), a.picture);
        Bitmap bMapScaled = Bitmap.createScaledBitmap(bMap, 150, 150, true);
        image.setImageBitmap(bMapScaled);
        title.setText(a.title);
        TextView dateDes = (TextView) findViewById(R.id.dateDes);
        dateDes.setText("("+a.dateDes+")");
        TextView des = (TextView) findViewById(R.id.Des);
        des.setText(a.des);
    }
}
