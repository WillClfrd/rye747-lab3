package edu.utsa.cs3443.rye747_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.rye747_lab3.controller.AvengersController;

/**
 * This class is responsible for instantiating views for the activity_main layout, including assigning onClickListeners to the instantiated views
 *
 * @author William Clifford rye747
 */
public class MainActivity extends AppCompatActivity {
    private AvengersController controller;

    /**
     * This method is responsible for initializing the application view, and instantiating the button views for the activity_main layout
     *
     * @param savedInstanceState a Bundle class object that is passed into the inherited class onCreate method
     */
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

    /**
     * This method initializes the view matching the specified id as a Button class object with an onClickListener
     *
     * @param buttonID the id used in the findViewById method to find views within the activity_main layout
     */
    private void setupButton(int buttonID) {
        Button button = findViewById(buttonID);
        button.setOnClickListener(controller);
    }
}