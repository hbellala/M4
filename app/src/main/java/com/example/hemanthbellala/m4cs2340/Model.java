package com.example.hemanthbellala.m4cs2340;

import android.support.compat.BuildConfig;

import com.example.hemanthbellala.m4cs2340.User;
import com.example.hemanthbellala.m4cs2340.UserType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hemanthbellala on 10/2/17.
 */

public class Model {
    /** Singleton instance */
    private static final Model _instance = new Model();
    public static Model getInstance() { return _instance; }

    /** holds the list of all courses */
    private static List<User> _user;

    /** the currently selected course, defaults to first course */
    private static User _currentUser;

    private static List<SightingDataItem> sightings;

    /** Null Object pattern, returned when no course is found */
    // private final UserType theNullCourse = new Course("No Such Course", "9999", SchoolCode.XX);


    /**
     * make a new model
     */
    private Model() {
        _user = new ArrayList<>();
        sightings = new ArrayList<>();


    }

    /**
     * get the courses
     * @return a list of the courses in the app
     */
    public static List<User> getUsers() { return _user; }



    /**
     *
     * @return  the currently selected course
     */
    public static User getCurrentUser() { return _currentUser;}

    public void setCurrentUser(User course) { _currentUser = course; }



//    /**
//     * add a student to the current course
//     *
//     * @param user the student to add
//     * @return true if student added, false if not added
//     */
    public void addUser(User user) {
        _user.add(user);

    }

    public void addSighting(SightingDataItem sighting) {
        sightings.add(sighting);
    }

    public List<SightingDataItem> getItems() {
        return sightings;
    }

    public SightingDataItem getItemById(int i) {
        return sightings.get(i);
    }


}
