package com.example.glr.internhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Connecting our button to code so we can manipulate it
    private Button newActivityButton;
    private TextView mainTextView;

    private Intern george = new Intern();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        george.name = "George";
        george.eatLunch();
        String status = george.checkIn();

        newActivityButton = (Button) findViewById(R.id.newActivityButton);
        mainTextView = (TextView) findViewById(R.id.mainTextView);
        mainTextView.setText(status);


        // Creating the listener (telling it what to do when it triggers)
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage(view);
            }
        };

        // Setting the button's listener property
        newActivityButton.setOnClickListener(listener);
    }

    // Creates a new Intent to take us to the detail activity
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

}
