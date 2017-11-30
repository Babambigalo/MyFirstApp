package com.example.android.myfirstapp;

/**
 * Created by nmatveev on 10.11.2017.
 */

public class Category {
    private String mName;
    private String mAddress;
    private String mNumber;
    private String mPhoto;

    public Category(String name,String address,String number,String photo){
        mAddress = address;
        mNumber = number;
        mName = name;
        mPhoto = photo;
    }

    public Category(String name,String address,String photo){
        mAddress = address;
        mPhoto = photo;
        mName = name;

    }


    public Category(String name,String address){
        mAddress = address;
        mName = name;

    }



    public String getmPhoto() {
        return mPhoto;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmName() {
        return mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public void setmPhoto(String mPhoto) {
        this.mPhoto = mPhoto;
    }






    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}
