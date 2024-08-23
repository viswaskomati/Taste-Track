package com.example.foodapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Cartitems implements Parcelable {
    // ... other class variables
    public String name;
    public int price;
    protected Cartitems(Parcel in) {
        // Read data from parcel and initialize class variables
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // Write class variables to parcel
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Cartitems> CREATOR = new Creator<Cartitems>() {
        @Override
        public Cartitems createFromParcel(Parcel in) {
            return new Cartitems(in);
        }

        @Override
        public Cartitems[] newArray(int size) {
            return new Cartitems[size];
        }
    };

    public Cartitems(String name, int price) {
        this.name=name;
        this.price=price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
