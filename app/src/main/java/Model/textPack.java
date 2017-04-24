package Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by bl4deofsoul on 4/24/2017 AD.
 */

public class textPack implements Parcelable {
    public ArrayList<String> textList = new ArrayList<String>();

    public textPack(Parcel in) {
        textList = in.createStringArrayList();
    }

    public static final Creator<textPack> CREATOR = new Creator<textPack>() {
        @Override
        public textPack createFromParcel(Parcel in) {
            return new textPack(in);
        }

        @Override
        public textPack[] newArray(int size) {
            return new textPack[size];
        }
    };

    public textPack() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringList(textList);
    }
}
