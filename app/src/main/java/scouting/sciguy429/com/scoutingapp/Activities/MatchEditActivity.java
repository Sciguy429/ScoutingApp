package scouting.sciguy429.com.scoutingapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import scouting.sciguy429.com.scoutingapp.Objects.MatchData;
import scouting.sciguy429.com.scoutingapp.R;
import scouting.sciguy429.com.scoutingapp.Utilities.H2SQL;

public class MatchEditActivity extends AppCompatActivity {

    H2SQL H2SQL = new H2SQL();
    MatchData matchData;

    TextView matchName;
    TextView teamNumber;
    EditText cubesPlacedOnScale;
    EditText cubesPlacedOnSwitch;
    EditText cubesPlacedInPortal;
    EditText fouls;
    EditText cards;
    CheckBox climb;
    CheckBox fell;
    EditText comments;

    Button cancel;
    Button confirm;

    ArrayList<String> designations = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_edit);

        designations.add("R1");
        designations.add("R2");
        designations.add("R3");

        designations.add("B1");
        designations.add("B2");
        designations.add("B3");

        matchData = H2SQL.getMatchData(getIntent().getIntExtra("match", 1), getIntent().getIntExtra("team", 1));

        matchName = findViewById(R.id.matchName);
        teamNumber = findViewById(R.id.teamNumber);
        cubesPlacedOnScale = findViewById(R.id.matchCubesOnScale);
        cubesPlacedOnSwitch = findViewById(R.id.matchCubesOnSwitch);
        cubesPlacedInPortal = findViewById(R.id.matchCubesInPortal);
        fouls = findViewById(R.id.matchFouls);
        cards = findViewById(R.id.matchCards);
        climb = findViewById(R.id.matchClimb);
        fell = findViewById(R.id.matchFell);
        comments = findViewById(R.id.matchComments);

        cancel = findViewById(R.id.matchCancel);
        confirm = findViewById(R.id.matchConfirm);

        matchName.setText("Match " + matchData.matchNumber + " (" + designations.get(matchData.matchTeamDesignation) + ")");
        teamNumber.setText("Team: " + String.valueOf(matchData.teamNumber));
        cubesPlacedOnScale.setText(String.valueOf(matchData.cubesOnScale));
        cubesPlacedOnSwitch.setText(String.valueOf(matchData.cubesOnSwitch));
        cubesPlacedInPortal.setText(String.valueOf(matchData.cubesInPortal));
        fouls.setText(String.valueOf(matchData.fouls));
        cards.setText(String.valueOf(matchData.cards));
        climb.setChecked(matchData.climb);
        fell.setChecked(matchData.fell);
        comments.setText(matchData.comment);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                H2SQL.setMatchData(new MatchData(matchData.matchNumber, matchData.teamNumber, matchData.matchTeamDesignation, Integer.valueOf(cubesPlacedOnScale.getText().toString()), Integer.valueOf(cubesPlacedOnSwitch.getText().toString()), Integer.valueOf(cubesPlacedInPortal.getText().toString()), climb.isChecked(), fell.isChecked(), Integer.valueOf(fouls.getText().toString()), Integer.valueOf(cards.getText().toString()), comments.getText().toString()));
                finish();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
