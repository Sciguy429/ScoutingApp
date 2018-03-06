package scouting.sciguy429.com.scoutingapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import scouting.sciguy429.com.scoutingapp.Objects.MatchData;
import scouting.sciguy429.com.scoutingapp.R;
import scouting.sciguy429.com.scoutingapp.Utilities.H2SQL;

public class MatchEditActivity extends AppCompatActivity {

    H2SQL H2SQL = new H2SQL();
    MatchData matchData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_edit);

        matchData = H2SQL.getMatchData(getIntent().getIntExtra("match", 1), getIntent().getIntExtra("team", 1));
    }
}
