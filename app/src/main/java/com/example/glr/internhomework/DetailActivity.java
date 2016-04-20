package com.example.glr.internhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView detailTextView;
    private Button hiButton;
    private Button lunchButton;
    private Button checkOnButton;



    private Intern george = new Intern();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailTextView = (TextView) findViewById(R.id.detailTextView);
        hiButton = (Button) findViewById(R.id.hiButton);
        lunchButton = (Button) findViewById(R.id.lunchButton);
        checkOnButton = (Button) findViewById(R.id.checkOnButton);

        String internName = getIntent().getStringExtra("name");
        george.name = internName;

        // Creating a listener that follows all buttons based on their id
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message;
                switch(view.getId())   {
                    case R.id.hiButton:
                        message = george.sayHi();
                        Log.d("*****", message);
                        break;
                    case R.id.lunchButton:
                        message = george.eatLunch();
                        Log.d("*****", message);
                        break;
                    case R.id.checkOnButton:
                        message = george.checkIn();
                        Log.d("*****", message);
                        break;
                    default:
                        message = "where's our intern???";
                        break;
                }
                detailTextView.setText(message);
            }
        };

        // Setting the button's listener property
        hiButton.setOnClickListener(listener);
        lunchButton.setOnClickListener(listener);
        checkOnButton.setOnClickListener(listener);

    }
}
