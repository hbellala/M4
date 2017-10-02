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
    private List<User> _user;

    /** the currently selected course, defaults to first course */
    private User _currentUser;

    /** Null Object pattern, returned when no course is found */
    // private final UserType theNullCourse = new Course("No Such Course", "9999", SchoolCode.XX);


    /**
     * make a new model
     */
    private Model() {
        _user = new ArrayList<>();



    }

    /**
     * get the courses
     * @return a list of the courses in the app
     */
    public List<User> getCourses() { return _user; }



    /**
     *
     * @return  the currently selected course
     */
    public User getCurrentUser() { return _currentUser;}

    public void setCurrentCourse(User course) { _currentUser = course; }



    /**
     * add a student to the current course
     *
     * @param user the student to add
     * @return true if student added, false if not added
     */
    public boolean addUser(User user) {
        return _currentUser != null && _currentUser.addUser(user);
    }


}
