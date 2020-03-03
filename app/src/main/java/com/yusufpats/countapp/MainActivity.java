package com.yusufpats.countapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;


/**
 * STEP-1: Declare view variables globaly and BindViews from the xml
 * STEP-2: Declare a variable `mCount` and initialize it to `0`
 * STEP-3: Setup clicks on the buttons to increment / decrement the value of count variable
 * STEP-4: Display the updated value of the `mCount` variable in the TextView
 */
public class MainActivity extends AppCompatActivity {


    // STEP-1: View objects
    private TextView countTextView;
    private Button incrementButton, decrementButton;

    // STEP-2: Data variables
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // STEP-1: Bind the Views from the xml layout file to the java activity file
        bindViews();

        // STEP-3: Setup the clicks on the increment and decrement buttons
        setupButtons();
    }

    private void bindViews() {
        countTextView = findViewById(R.id.count_text_view);
        incrementButton = findViewById(R.id.increment_button);
        decrementButton = findViewById(R.id.decrement_button);
    }

    private void setupButtons() {
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // STEP-3:  INCREMENT count variable
                mCount++;
                // STEP-4:  display the new value of count in the text view
                displayCountValue();
            }
        });

        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // STEP-3:  DECREMENT count variable
                mCount--;
                // STEP-4:  display the new value of count in the text view
                displayCountValue();
            }
        });
    }

    private void displayCountValue() {
        // STEP-4:  display the new value of count in the text view
        countTextView.setText(String.format(Locale.getDefault(), "%d", mCount));
    }
}
