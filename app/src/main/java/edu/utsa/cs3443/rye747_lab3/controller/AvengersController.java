package edu.utsa.cs3443.rye747_lab3.controller;

import android.app.Activity;
import android.content.res.AssetManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileNotFoundException;

import edu.utsa.cs3443.rye747_lab3.R;
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

        if(view.getId() == R.id.avenger_button_1) {
            //ind = 0;
            Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
        }
        else if(view.getId() == R.id.avenger_button_2) {
            //ind = 1;
            Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
        }
        else if(view.getId() == R.id.avenger_button_3) {
            //ind = 2;
            Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
        }
        else if(view.getId() == R.id.avenger_button_4) {
            //ind = 3;
            Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
        }
        else if(view.getId() == R.id.avenger_button_5) {
            //ind = 4;
            Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
        }
        else if(view.getId() == R.id.avenger_button_6) {
            //ind = 5;
            Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
        }
        else if(view.getId() == R.id.avenger_button_7) {
            //ind = 6;
            Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
        }
        else if(view.getId() == R.id.avenger_button_8) {
            //ind = 7;
            Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
        }
        else if(view.getId() == R.id.avenger_button_9) {
            //ind = 8;
            Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
        }
        else if(view.getId() == R.id.avenger_button_10) {
            //ind = 9;
            Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
        }
    }
}
