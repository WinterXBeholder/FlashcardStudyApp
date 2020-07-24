package com.example.studyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button SubmitPrinciple = (Button) findViewById(R.id.SubmitPrinciple);
        SubmitPrinciple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText PrincipleNameEntry = (EditText) findViewById(R.id.PrincipleNameEntry);
                EditText PrincipleDescriptionEntry = (EditText) findViewById(R.id.PrincipleDescriptionEntry);
                EditText PrincipleFormulaEntry = (EditText) findViewById(R.id.PrincipleFormulaEntry);
                String PrincipleName = PrincipleNameEntry.getText().toString();
                String PrincipleDescription = PrincipleDescriptionEntry.getText().toString();
                String PrincipleFormula = PrincipleFormulaEntry.getText().toString();

            }
        });

        Button cancelButton = (Button) findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToNavigation = new Intent(getApplicationContext(),NavigationActivity.class);
                startActivity(GoToNavigation);
            }
        });

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

}