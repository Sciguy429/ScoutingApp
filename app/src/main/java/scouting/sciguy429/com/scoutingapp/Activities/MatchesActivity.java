package scouting.sciguy429.com.scoutingapp.Activities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import scouting.sciguy429.com.scoutingapp.Objects.Match;
import scouting.sciguy429.com.scoutingapp.Adapters.MatchesAdapter;
import scouting.sciguy429.com.scoutingapp.Utilities.H2SQL;

public class MatchesActivity extends ListActivity {

    ArrayList<Match> matches = new ArrayList<>();
    H2SQL H2SQL = new H2SQL();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (int i = 1; i <= H2SQL.getNumberOfMatches(); i++) {
            matches.add(H2SQL.getMatch(i));
        }
        MatchesAdapter matchesAdapter = new MatchesAdapter(getApplicationContext(), matches);
        setListAdapter(matchesAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Do something when a list item is clicked
        Toast.makeText(getApplicationContext(), "Number: " + matches.get(position).matchNumber, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), MatchViewActivity.class);
        intent.putExtra("match", position + 1);
        startActivity(intent);
    }
}
