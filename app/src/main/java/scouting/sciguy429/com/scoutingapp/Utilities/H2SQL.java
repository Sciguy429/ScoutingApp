package scouting.sciguy429.com.scoutingapp.Utilities;

import android.os.Environment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import scouting.sciguy429.com.scoutingapp.Objects.DBBAK;
import scouting.sciguy429.com.scoutingapp.Objects.Match;
import scouting.sciguy429.com.scoutingapp.Objects.MatchData;
import scouting.sciguy429.com.scoutingapp.Objects.Team;

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
    public void initializeDatabase(){
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(new DBBAK().sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Match getMatch(int matchNumber) {
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From MATCHES WHERE MATCH_NUMBER=" + String.valueOf(matchNumber));
            resultSet.first();
            return new Match(resultSet.getInt(1), resultSet.getInt(2), resultSet.getInt(11), resultSet.getInt(20), resultSet.getInt(29), resultSet.getInt(38), resultSet.getInt(47));
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
                matches.add(new Match(resultSet.getInt(1), resultSet.getInt(2), resultSet.getInt(11), resultSet.getInt(20), resultSet.getInt(29), resultSet.getInt(38), resultSet.getInt(47)));
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
            int teamRow;
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From MATCHES WHERE MATCH_NUMBER=" + String.valueOf(matchNumber));
            resultSet.first();
            for (int i = 0; i < 6; i++) {
                teamRow = (i * 9) + 2;
                if (resultSet.getInt(teamRow) == teamNumber) {
                    return new MatchData(matchNumber, teamNumber, i, resultSet.getInt(teamRow + 1), resultSet.getInt(teamRow + 2), resultSet.getInt(teamRow + 3), resultSet.getBoolean(teamRow + 4), resultSet.getBoolean(teamRow + 5), resultSet.getInt(teamRow + 6), resultSet.getInt(teamRow + 7), resultSet.getString(teamRow + 8));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }
    public void setMatchData(MatchData matchData) {
        try {
            Statement statement = conn.createStatement();
            char c = 'R';
            matchData.matchTeamDesignation++;
            if (matchData.matchTeamDesignation > 3) {
                matchData.matchTeamDesignation = matchData.matchTeamDesignation - 3;
                c = 'B';
            }

            statement.executeUpdate("UPDATE MATCHES SET MATCH_" + c + String.valueOf(matchData.matchTeamDesignation) + "_CUBES_ON_SCALE = " + String.valueOf(matchData.cubesOnScale) + " WHERE MATCH_NUMBER = " + String.valueOf(matchData.matchNumber) + ";");
            statement.executeUpdate("UPDATE MATCHES SET MATCH_" + c + String.valueOf(matchData.matchTeamDesignation) + "_CUBES_ON_SWITCH = " + String.valueOf(matchData.cubesOnSwitch) + " WHERE MATCH_NUMBER = " + String.valueOf(matchData.matchNumber) + ";");
            statement.executeUpdate("UPDATE MATCHES SET MATCH_" + c + String.valueOf(matchData.matchTeamDesignation) + "_CUBES_IN_PORTAL = " + String.valueOf(matchData.cubesInPortal) + " WHERE MATCH_NUMBER = " + String.valueOf(matchData.matchNumber) + ";");

            statement.executeUpdate("UPDATE MATCHES SET MATCH_" + c + String.valueOf(matchData.matchTeamDesignation) + "_CLIMB = " + String.valueOf(matchData.climb) + " WHERE MATCH_NUMBER = " + String.valueOf(matchData.matchNumber) + ";");
            statement.executeUpdate("UPDATE MATCHES SET MATCH_" + c + String.valueOf(matchData.matchTeamDesignation) + "_FELL = " + String.valueOf(matchData.fell) + " WHERE MATCH_NUMBER = " + String.valueOf(matchData.matchNumber) + ";");

            statement.executeUpdate("UPDATE MATCHES SET MATCH_" + c + String.valueOf(matchData.matchTeamDesignation) + "_FOULS = " + String.valueOf(matchData.fouls) + " WHERE MATCH_NUMBER = " + String.valueOf(matchData.matchNumber) + ";");
            statement.executeUpdate("UPDATE MATCHES SET MATCH_" + c + String.valueOf(matchData.matchTeamDesignation) + "_CARDS = " + String.valueOf(matchData.cards) + " WHERE MATCH_NUMBER = " + String.valueOf(matchData.matchNumber) + ";");

            statement.executeUpdate("UPDATE MATCHES SET MATCH_" + c + String.valueOf(matchData.matchTeamDesignation) + "_COMMENT = '" + matchData.comment + "' WHERE MATCH_NUMBER = " + String.valueOf(matchData.matchNumber) + ";");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Team> getTeams() {
        ArrayList<Team> teams = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From TEAMS");
            while (resultSet.next()) {
                teams.add(new Team(resultSet.getInt(1), resultSet.getString(2), resultSet.getFloat(6), resultSet.getBoolean(9), resultSet.getBoolean(8), resultSet.getBoolean(7), resultSet.getBoolean(10), resultSet.getBoolean(11), resultSet.getString(3), resultSet.getString(12), resultSet.getString(13)));
            }
            return teams;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public Team getTeam(int teamNumber) {
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From TEAMS WHERE TEAM_NUMBER=" + String.valueOf(teamNumber));
            if (resultSet.first()) {
                System.out.println(resultSet.getString(2));
                return new Team(resultSet.getInt(1), resultSet.getString(2), resultSet.getFloat(6), resultSet.getBoolean(9), resultSet.getBoolean(8), resultSet.getBoolean(7), resultSet.getBoolean(10), resultSet.getBoolean(11), resultSet.getString(3), resultSet.getString(12), resultSet.getString(13));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    public void setTeam(Team team) {
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("REPLACE INTO TEAMS VALUES (" + team.teamNumber + ", '" + team.teamName + "', '" + team.driveTrainInfo + "', '', '', " + team.robotHeight + ", " + team.canPlaceOnScale + ", " + team.canPlaceOnSwitch + ", " + team.canClimb + ", " + team.canPlaceInPortal + ", " + team.canPlaceInAnyOrientation + ", '" + team.cubePlaceMethod + "', '" + team.comments + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
