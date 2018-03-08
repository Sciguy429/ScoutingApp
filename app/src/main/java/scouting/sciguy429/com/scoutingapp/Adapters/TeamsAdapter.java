package scouting.sciguy429.com.scoutingapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import scouting.sciguy429.com.scoutingapp.Objects.Team;
import scouting.sciguy429.com.scoutingapp.R;

public class TeamsAdapter extends ArrayAdapter<Team> {
    public TeamsAdapter(Context context, ArrayList<Team> teams) {
        super (context, 0, teams);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Team team = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.teams_list_item, parent, false);
        }
        TextView teamNumber = convertView.findViewById(R.id.teamNumber);
        TextView teamName = convertView.findViewById(R.id.teamName);

        teamNumber.setText(String.valueOf(team.teamNumber));
        teamName.setText(team.teamName);

        return convertView;
    }
}
