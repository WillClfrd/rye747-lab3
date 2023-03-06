package edu.utsa.cs3443.rye747_lab3.controller;

import android.app.Activity;
import android.content.res.AssetManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.io.FileNotFoundException;
import edu.utsa.cs3443.rye747_lab3.model.Team;

public class AvengersController implements View.OnClickListener {
    Activity activity;
    AssetManager manager;
    Team avengers;

    public AvengersController(Activity activity){
        this.activity = activity;
        this.manager = activity.getAssets();
    }
    @Override
    public void onClick(View view) {
        //int ind;
        avengers = new Team();
        Button btn = (Button)view;
        try {
            avengers.loadAvengers(manager);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
    }
}
