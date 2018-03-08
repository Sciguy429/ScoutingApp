package scouting.sciguy429.com.scoutingapp.Activities;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import scouting.sciguy429.com.scoutingapp.Adapters.MatchesAdapter;
import scouting.sciguy429.com.scoutingapp.Adapters.TeamsAdapter;
import scouting.sciguy429.com.scoutingapp.Objects.Match;
import scouting.sciguy429.com.scoutingapp.Objects.Team;
import scouting.sciguy429.com.scoutingapp.Utilities.H2SQL;

public class TeamsActivity extends ListActivity {

    ArrayList<Team> teams = new ArrayList<>();
    scouting.sciguy429.com.scoutingapp.Utilities.H2SQL H2SQL = new H2SQL();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        teams = H2SQL.getTeams();
        TeamsAdapter teamsAdapter = new TeamsAdapter(getApplicationContext(), teams);
        setListAdapter(teamsAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Do something when a list item is clicked
        Intent intent = new Intent(getApplicationContext(), TeamViewActivity.class);
        intent.putExtra("team", teams.get(position).teamNumber);
        startActivity(intent);
    }
}
