package scouting.sciguy429.com.scoutingapp.Activities;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import scouting.sciguy429.com.scoutingapp.Adapters.Match;
import scouting.sciguy429.com.scoutingapp.Adapters.MatchesAdapter;

public class MatchesActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Match[] mat = {
                new Match(1, 1465, 2213, 3438, 4986, 5363, 6981),
                new Match(2, 1145, 2895, 3752, 4974, 5115, 6745),
                new Match(3, 1145, 2826, 3002, 4074, 5586, 6740)
        };
        ArrayList<Match> matches = new ArrayList<>();
        matches.addAll(Arrays.asList(mat));

        MatchesAdapter matchesAdapter = new MatchesAdapter(getApplicationContext(), matches);
        setListAdapter(matchesAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Do something when a list item is clicked
        Toast.makeText(getApplicationContext(), "Button: " + id, Toast.LENGTH_SHORT).show();
    }
}
