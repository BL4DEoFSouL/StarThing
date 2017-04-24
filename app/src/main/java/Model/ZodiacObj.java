package Model;

/**
 * Created by bl4deofsoul on 4/23/2017 AD.
 */

public class ZodiacObj {
    public String title;
    public int startDate365;
    public int startDate366;
    public String dateDes;
    public String des;
    public int picture;

    public ZodiacObj(String t, int s1, int s2, String dd, String d, int pic){
        title = t;
        startDate365 = s1;
        startDate366 = s2;
        dateDes = dd;
        des = d;
        picture = pic;
    }

    public ZodiacObj() {

    }
}
