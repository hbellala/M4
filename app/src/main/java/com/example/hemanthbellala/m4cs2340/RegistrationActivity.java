package com.example.hemanthbellala.m4cs2340;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;



/**
 * Created by hemanthbellala on 9/30/17.
 */

public class RegistrationActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private EditText userNameField;
    private EditText passwordField;
    private Spinner userTypeSpinner;
    private User _user;

    private String _userType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration1);



        userNameField = (EditText) findViewById(R.id.username);
        passwordField = (EditText) findViewById(R.id.password);
        userTypeSpinner = (Spinner) findViewById(R.id.userTypeSpinner);
        //creating a new account


        //Fills the spinner
        /*
          Set up the adapter to display the allowable majors in the spinner
         */
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, User.userTypes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        userTypeSpinner.setAdapter(adapter);
        _user = new User();

        userNameField.setText(_user.getUserName());
        passwordField.setText(_user.getPassword());
    }

    public void onRegisterPressed(View view) {
        Log.d("Creating account", "Add new account");
        Model model = Model.getInstance();

        _user.set_userName(userNameField.getText().toString());
        _user.setUserType((UserType) userTypeSpinner.getSelectedItem());
        _user.set_password((String) passwordField.getText().toString());

        model.addUser(_user);

        finish();
    }

    /**
     * Button handler for cancel
     *
     * @param view the button pressed
     */
    public void onCancelPressed(View view) {
        Log.d("Edit", "Cancel Student");
        finish();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
        _userType = parent.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        _userType = "NA";
    }
}
