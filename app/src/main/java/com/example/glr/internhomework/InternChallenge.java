package com.example.glr.internhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class InternChallenge extends AppCompatActivity {

    private ListView internListView;

    private String[] namesFromFirstScene;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intern_challenge);

        internListView = (ListView) findViewById(R.id.internListView);

        namesFromFirstScene = getIntent().getStringArrayExtra("allNames");

        for (int i = 0; i < namesFromFirstScene.length; i++)    {
            Log.d("intern", namesFromFirstScene[i]);
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, namesFromFirstScene);

        internListView.setAdapter(adapter);

    }
}
