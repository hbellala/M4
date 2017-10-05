package com.example.hemanthbellala.m4cs2340;

/**
 * Created by mikereilly on 10/4/17.
 */

public class SightingDataItem {
    private int key;
    private String date;
    private String locationType;
    private String zip;
    private String address;
    private String city;
    private String borough;
    private String latitude;
    private String longitude;

    public SightingDataItem (int k, String d, String lt, String z, String a, String c, String b, String lat, String lon) {
        key = k;
        date = d;
        locationType = lt;
        zip = z;
        address = a;
        city = c;
        borough = b;
        latitude = lat;
        longitude = lon;
    }

    public int getKey() {
        return key;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return key + ": " + address;
    }
}