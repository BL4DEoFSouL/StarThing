package Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by bl4deofsoul on 4/23/2017 AD.
 */

public class DOYandYEAR implements Parcelable {
    public int DOY;
    public int year;

    public DOYandYEAR(int a, int b){
        DOY = a;
        year = b;
    }

    protected DOYandYEAR(Parcel in) {
        DOY = in.readInt();
        year = in.readInt();
    }

    public static final Creator<DOYandYEAR> CREATOR = new Creator<DOYandYEAR>() {
        @Override
        public DOYandYEAR createFromParcel(Parcel in) {
            return new DOYandYEAR(in);
        }

        @Override
        public DOYandYEAR[] newArray(int size) {
            return new DOYandYEAR[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(DOY);
        dest.writeInt(year);
    }
}
