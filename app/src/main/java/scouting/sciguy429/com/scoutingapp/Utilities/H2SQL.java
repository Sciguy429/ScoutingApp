package scouting.sciguy429.com.scoutingapp.Utilities;

import android.os.Environment;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import scouting.sciguy429.com.scoutingapp.Objects.Match;

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
    public Match getMatch(int matchNumber) {
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From MATCHES WHERE MATCH_NUMBER=" + String.valueOf(matchNumber));
            while (resultSet.next()) {
                Log.d(TAG, String.valueOf(resultSet.getInt(1)));
            }
            return new Match(0, 0, 0, 0, 0, 0, 0);
        } catch (SQLException e) {
            e.printStackTrace();
            return new Match(0, 0, 0, 0, 0, 0, 0);
        }
    }
}
