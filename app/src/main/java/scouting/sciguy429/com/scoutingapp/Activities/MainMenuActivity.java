package scouting.sciguy429.com.scoutingapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import scouting.sciguy429.com.scoutingapp.R;

public class MainMenuActivity extends AppCompatActivity {

    Button matchesButton;
    Button teamsButton;
    Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        matchesButton = findViewById(R.id.matchesButton);
        matchesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(getApplicationContext(), MatchesActivity.class));
            }
        });

        teamsButton = findViewById(R.id.teamsButton);
        teamsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        settingsButton = findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
