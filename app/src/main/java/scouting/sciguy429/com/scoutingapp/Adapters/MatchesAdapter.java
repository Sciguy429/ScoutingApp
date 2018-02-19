package scouting.sciguy429.com.scoutingapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import scouting.sciguy429.com.scoutingapp.R;

public class MatchesAdapter extends ArrayAdapter<Match> {
    public MatchesAdapter(Context context, ArrayList<Match> matches) {
        super (context, 0, matches);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Match match = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.matches_list_item, parent, false);
        }
        TextView matchNumber = convertView.findViewById(R.id.matchNumber);
        TextView teamR1 = convertView.findViewById(R.id.teamR1);
        TextView teamR2 = convertView.findViewById(R.id.teamR2);
        TextView teamR3 = convertView.findViewById(R.id.teamR3);
        TextView teamB1 = convertView.findViewById(R.id.teamB1);
        TextView teamB2 = convertView.findViewById(R.id.teamB2);
        TextView teamB3 = convertView.findViewById(R.id.teamB3);

        matchNumber.setText(match.matchNumber + ": ");
        teamR1.setText("Team 1: " + match.teamR1);
        teamR2.setText("Team 2: " + match.teamR2);
        teamR3.setText("Team 3: " + match.teamR3);
        teamB1.setText("Team 1: " + match.teamB1);
        teamB2.setText("Team 2: " + match.teamB2);
        teamB3.setText("Team 3: " + match.teamB3);

        return convertView;
    }
}
