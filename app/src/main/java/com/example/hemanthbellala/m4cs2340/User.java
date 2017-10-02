package com.example.hemanthbellala.m4cs2340;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hemanthbellala on 10/1/17.
 */

public class User implements Parcelable{
    public static List<String> userTypes = Arrays.asList("Admin", "User");

    //User name
    private String _userName;
    //password
    private String _password;
    //enum for user type
    private UserType _userType;
    /* **********************
     * Getters and setters
     */
    public String getUserName() { return _userName; }
    public void set_userName(String name) { _userName = name; }


    public String getPassword() {return _password; }
    public void set_password(String major) { _password = major; }

    public void setUserType(UserType u) {_userType = u;}
    public UserType get_UserType() {return _userType;}


    public User(String uN, String p, UserType u) {
        _userType = u;
        _password = p;
        _userName = uN;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    private User(Parcel in) {
        _userName = in.readString();
        _password = in.readString();
        _userType = (UserType) in.readSerializable();
    }

    public User() {
        this("Enter your User name", "Enter Your Password", UserType.USER);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(_userName);
        parcel.writeString(_password);
        parcel.writeSerializable(_userType);
    }

    public static final Parcelable.Creator<User> CREATOR
            = new Parcelable.Creator<User>() {
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
