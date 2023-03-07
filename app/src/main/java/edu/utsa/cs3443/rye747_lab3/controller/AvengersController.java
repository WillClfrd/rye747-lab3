package edu.utsa.cs3443.rye747_lab3.controller;

import android.app.Activity;
import android.content.res.AssetManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import edu.utsa.cs3443.rye747_lab3.model.Team;

/**
 * This class is responsible for implementing the OnClickListener Interface and maintaining an AssetManager object
 *
 * @author William Clifford rye747
 */
public class AvengersController implements View.OnClickListener {
    private Activity activity;
    private AssetManager manager;
    private Team avengers;

    /**
     * The AvengersController constructor instantiates an AvengersController object with the object activity attribute set to the specified value, and the object manager attribute set to the output of the Activity class getAssets method
     *
     * @param activity the specified value to be assigned to the AvengersController class object activity attribute
     */
    public AvengersController(Activity activity){
        this.activity = activity;
        this.manager = activity.getAssets();
    }

    /**
     * This method is an on click listener for the AvengersController object activity attribute
     *
     * @param view the view passed in by the OnClickListener, this view is used to determine the action taken by the onClick method
     */
    @Override
    public void onClick(View view) {
        avengers = new Team();
        Button btn = (Button)view;
        avengers.loadAvengers(manager);
        Toast.makeText(btn.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
    }
}
