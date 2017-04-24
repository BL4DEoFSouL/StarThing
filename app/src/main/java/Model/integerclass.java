package Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by bl4deofsoul on 4/22/2017 AD.
 */

public class integerclass implements Parcelable {
    public int a;
    public int b;

    public integerclass(Parcel in) {
        a = in.readInt();
    }

    public static final Creator<integerclass> CREATOR = new Creator<integerclass>() {
        @Override
        public integerclass createFromParcel(Parcel in) {
            return new integerclass(in);
        }

        @Override
        public integerclass[] newArray(int size) {
            return new integerclass[size];
        }
    };

    public integerclass() {

    }
    public integerclass(int b){
        a = b;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(a);
    }
}
