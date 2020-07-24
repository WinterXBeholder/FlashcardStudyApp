package com.example.studyapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        Button principlesListButton = (Button) findViewById(R.id.principlesListButton);
        principlesListButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent GoToPrinciplesList = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(GoToPrinciplesList);
            }
        });
        Button AddPrincipleButton = (Button) findViewById(R.id.addPrincipleButton);
        AddPrincipleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent GoToAddPrinciples = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(GoToAddPrinciples);
            }
        });
        Button StudyButton = (Button) findViewById(R.id.studyButton);
        StudyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent GoToStudy = new Intent(getApplicationContext(), StudyActivity.class);
                startActivity(GoToStudy);
            }
        });
    }
}