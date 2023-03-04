package edu.utsa.cs3443.rye747_lab3.controller;

import android.app.Activity;
import android.content.res.AssetManager;
import android.view.View;
import android.widget.Toast;

import java.io.FileNotFoundException;

import edu.utsa.cs3443.rye747_lab3.R;
import edu.utsa.cs3443.rye747_lab3.model.Team;

public class AvengersController implements View.OnClickListener {
    private Activity activity;
    private AssetManager manager;
    private Team avengers;

    public AvengersController(Activity activity){
        this.activity = activity;
        this.manager = activity.getAssets();
    }
    @Override
    public void onClick(View view) {
        avengers = new Team();
        try {
            avengers.loadAvengers(manager);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        switch(view.getId()){
            case R.id.avenger_button_1:
                Toast.makeText(view.getContext(), "Temp", Toast.LENGTH_LONG).show();
                break;
            case R.id.avenger_button_2:
                Toast.makeText(view.getContext(), "Temp", Toast.LENGTH_LONG).show();
                break;
            case R.id.avenger_button_3:
                Toast.makeText(view.getContext(), "Temp", Toast.LENGTH_LONG).show();
                break;
            case R.id.avenger_button_4:
                Toast.makeText(view.getContext(), "Temp", Toast.LENGTH_LONG).show();
                break;
            case R.id.avenger_button_5:
                Toast.makeText(view.getContext(), "Temp", Toast.LENGTH_LONG).show();
                break;
            case R.id.avenger_button_6:
                Toast.makeText(view.getContext(), "Temp", Toast.LENGTH_LONG).show();
                break;
            case R.id.avenger_button_7:
                Toast.makeText(view.getContext(), "Temp", Toast.LENGTH_LONG).show();
                break;
            case R.id.avenger_button_8:
                Toast.makeText(view.getContext(), "Temp", Toast.LENGTH_LONG).show();
                break;
            case R.id.avenger_button_9:
                Toast.makeText(view.getContext(), "Temp", Toast.LENGTH_LONG).show();
                break;
            case R.id.avenger_button_10:
                Toast.makeText(view.getContext(), "Temp", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
