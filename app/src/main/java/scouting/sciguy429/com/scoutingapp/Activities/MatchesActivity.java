package scouting.sciguy429.com.scoutingapp.Activities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import scouting.sciguy429.com.scoutingapp.Objects.Match;
import scouting.sciguy429.com.scoutingapp.Adapters.MatchesAdapter;

public class MatchesActivity extends ListActivity {

    ArrayList<Match> matches = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Match[] mat = {
                new Match(1, 1465, 2213, 3438, 4986, 5363, 6981),
                new Match(2, 1145, 2895, 3752, 4974, 5115, 6745),
                new Match(3, 1145, 2826, 3002, 4074, 5586, 6740)
        };
        matches.addAll(Arrays.asList(mat));

        MatchesAdapter matchesAdapter = new MatchesAdapter(getApplicationContext(), matches);
        setListAdapter(matchesAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Do something when a list item is clicked
        Toast.makeText(getApplicationContext(), "Number: " + matches.get(position).matchNumber, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), MatchViewActivity.class);
        intent.putExtra("match", matches.get(position));
        startActivity(intent);
    }
}
