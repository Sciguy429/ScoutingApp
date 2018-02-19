package scouting.sciguy429.com.scoutingapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import scouting.sciguy429.com.scoutingapp.R;

public class MatchesActivity extends AppCompatActivity {

    ListView matchesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);

        matchesListView = findViewById(R.id.matchesListView);
    }
}
