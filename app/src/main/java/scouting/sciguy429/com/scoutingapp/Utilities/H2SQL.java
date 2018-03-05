package scouting.sciguy429.com.scoutingapp.Utilities;

import android.os.Environment;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    public void test() {
        try {
            ResultSet rset = conn.getMetaData().getColumns(null, "PUBLIC", "MATCHES", null);
            while (rset.next()) {
                Log.d(TAG, rset.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
