package edu.utsa.cs3443.rye747_lab3.controller;

import android.app.Activity;
import android.content.res.AssetManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.io.FileNotFoundException;
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
        Button btn = (Button)view;
        avengers.loadAvengers(manager);
        Toast.makeText(view.getContext(), avengers.getAvenger(btn.getText().toString()).getLocation(), Toast.LENGTH_LONG).show();
    }
}
