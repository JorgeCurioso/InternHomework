package com.example.glr.internhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Connecting our button to code so we can manipulate it
    private Button newActivityButton;
    private TextView mainTextView;

    private String[] interns;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newActivityButton = (Button) findViewById(R.id.newActivityButton);
        mainTextView = (TextView) findViewById(R.id.mainTextView);

        // Creating the listener (telling it what to do when it triggers)
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage(view);
            }
        };

        // Setting the button's listener property
        newActivityButton.setOnClickListener(listener);
        mainTextView.setText("George");


        interns = new String[] {
                "Kate Owens",
                "George Royce",
                "Tejvanshsingh Chhabra",
                "Yuri Ramoran",
                "Tijana Milovanovic"};

        for (int i = 0; i < interns.length; i++)    {
            Log.d("intern", interns[i]);
        };


}

    // Creates a new Intent to take us to the detail activity
    public void sendMessage(View view) {
        Intent intent = new Intent(this, InternChallenge.class);
//        intent.putExtra("name", mainTextView.getText().toString() );
        intent.putExtra("allNames", interns);
        startActivity(intent);
    }

}
