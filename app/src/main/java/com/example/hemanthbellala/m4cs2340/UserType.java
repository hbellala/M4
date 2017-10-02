package com.example.hemanthbellala.m4cs2340;

import java.io.Serializable;

/**
 * Created by hemanthbellala on 10/1/17.
 */

public enum UserType implements Serializable {
    ADMIN ("Admin"), USER("User");

    private final String type;

    UserType(String t) {
        type = t;
    }

    public String getUserType(){return type;}
    public String toString() {return type;}

}
