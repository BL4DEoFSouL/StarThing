package Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by bl4deofsoul on 4/22/2017 AD.
 */

public class DDMMYY implements Parcelable {
    int date;
    int month;
    int year;
    DDMMYY(int dd,int mm,int yy){
        date = dd;
        month = mm;
        year = yy;
    }

    protected DDMMYY(Parcel in) {
        date = in.readInt();
        month = in.readInt();
        year = in.readInt();
    }

    public static final Creator<DDMMYY> CREATOR = new Creator<DDMMYY>() {
        @Override
        public DDMMYY createFromParcel(Parcel in) {
            return new DDMMYY(in);
        }

        @Override
        public DDMMYY[] newArray(int size) {
            return new DDMMYY[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(date);
        dest.writeInt(month);
        dest.writeInt(year);
    }
}
