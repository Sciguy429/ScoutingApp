package scouting.sciguy429.com.scoutingapp.Utilities;

import android.os.Environment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import scouting.sciguy429.com.scoutingapp.Objects.Match;
import scouting.sciguy429.com.scoutingapp.Objects.MatchData;

public class H2SQL {
    private final String TAG = "H2SQL";
    private Connection conn;
    public H2SQL() {
        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:" + Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS) + "/DB/scouting", "JAVAADMIN", "%Lc3W+z~Y`sQ*?Zk"); //Connect To The H2 DB With JAVAADMIN
            //conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int getNumberOfMatches() {
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT (*) FROM MATCHES");
            int count = -1;
            if (resultSet.next())
            {
                count = resultSet.getInt(1);
            }
            return count;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public Match getMatch(int matchNumber) {
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From MATCHES WHERE MATCH_NUMBER=" + String.valueOf(matchNumber));
            resultSet.first();
            return new Match(resultSet.getInt(1), resultSet.getInt(2), resultSet.getInt(3), resultSet.getInt(4), resultSet.getInt(5), resultSet.getInt(6), resultSet.getInt(7));
            }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Match> getMatches() {
        ArrayList<Match> matches = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From MATCHES");
            while (resultSet.next()) {
                matches.add(new Match(resultSet.getInt(1), resultSet.getInt(2), resultSet.getInt(3), resultSet.getInt(4), resultSet.getInt(5), resultSet.getInt(6), resultSet.getInt(7)));
            }
            return matches;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public MatchData getMatchData(int matchNumber, int teamNumber) {
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From MATCHES WHERE MATCH_NUMBER=" + String.valueOf(matchNumber));
            resultSet.first();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }
}
