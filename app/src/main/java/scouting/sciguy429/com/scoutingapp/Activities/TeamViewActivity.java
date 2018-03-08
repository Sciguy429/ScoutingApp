package scouting.sciguy429.com.scoutingapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import scouting.sciguy429.com.scoutingapp.Objects.Team;
import scouting.sciguy429.com.scoutingapp.R;
import scouting.sciguy429.com.scoutingapp.Utilities.H2SQL;

public class TeamViewActivity extends AppCompatActivity {

    H2SQL H2SQL = new H2SQL();
    Team team;

    TextView teamNumber;
    TextView teamName;
    EditText robotHeight;
    CheckBox canClimb;
    CheckBox canPlaceOnSwitch;
    CheckBox canPlaceOnScale;
    CheckBox canPlaceInPortal;
    CheckBox canPlaceInAnyOrientation;
    EditText driveTrain;
    EditText cubePlaceMethod;
    EditText comments;
    Button teamOk;
    Button teamCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_view);

        team = H2SQL.getTeam(getIntent().getIntExtra("team", 0));

        teamNumber = findViewById(R.id.teamNumber);
        teamName = findViewById(R.id.teamName);
        robotHeight = findViewById(R.id.teamHeight);
        canClimb = findViewById(R.id.teamCanClimb);
        canPlaceOnSwitch = findViewById(R.id.teamCanPlaceOnSwitch);
        canPlaceOnScale = findViewById(R.id.teamCanPlaceOnScale);
        canPlaceInPortal = findViewById(R.id.teamCanPlaceInPortal);
        canPlaceInAnyOrientation = findViewById(R.id.teamCanPlaceInAnyOrientation);
        driveTrain = findViewById(R.id.teamDriveTrain);
        cubePlaceMethod = findViewById(R.id.teamCubePlaceMethod);
        comments = findViewById(R.id.teamComments);
        teamOk = findViewById(R.id.teamOk);
        teamCancel = findViewById(R.id.teamCancel);

        if (team != null) {
            teamNumber.setText("Team " + String.valueOf(team.teamNumber));
            teamName.setText(team.teamName);
            robotHeight.setText(String.valueOf(team.robotHeight));
            canClimb.setChecked(team.canClimb);
            canPlaceOnSwitch.setChecked(team.canPlaceOnSwitch);
            canPlaceOnScale.setChecked(team.canPlaceOnScale);
            canPlaceInPortal.setChecked(team.canPlaceInPortal);
            canPlaceInAnyOrientation.setChecked(team.canPlaceInAnyOrientation);
            driveTrain.setText(team.driveTrainInfo);
            cubePlaceMethod.setText(team.cubePlaceMethod);
            comments.setText(team.comments);
        }

        teamOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Team updatedTeam = new Team(team.teamNumber, team.teamName, Float.valueOf(robotHeight.getText().toString()), canClimb.isChecked(), canPlaceOnSwitch.isChecked(), canPlaceOnScale.isChecked(), canPlaceInPortal.isChecked(), canPlaceInAnyOrientation.isChecked(), driveTrain.getText().toString(), cubePlaceMethod.getText().toString(), comments.getText().toString());
                H2SQL.setTeam(updatedTeam);
                finish();
            }
        });

        teamCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
