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
            if (resultSet.next()) {
                return new Match(resultSet.getInt(1), resultSet.getInt(2), resultSet.getInt(3), resultSet.getInt(4), resultSet.getInt(5), resultSet.getInt(6), resultSet.getInt(7));
            }
            else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
