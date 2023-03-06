package edu.utsa.cs3443.rye747_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.rye747_lab3.controller.AvengersController;

public class MainActivity extends AppCompatActivity {
    AvengersController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new AvengersController(this);
        setupButton(R.id.avenger_button_1);
        setupButton(R.id.avenger_button_2);
        setupButton(R.id.avenger_button_3);
        setupButton(R.id.avenger_button_4);
        setupButton(R.id.avenger_button_5);
        setupButton(R.id.avenger_button_6);
        setupButton(R.id.avenger_button_7);
        setupButton(R.id.avenger_button_8);
        setupButton(R.id.avenger_button_9);
        setupButton(R.id.avenger_button_10);
    }

    private void setupButton(int buttonID) {
        Button button = findViewById(buttonID);
        button.setOnClickListener(controller);
    }
}