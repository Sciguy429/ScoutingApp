package scouting.sciguy429.com.scoutingapp.Activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

import scouting.sciguy429.com.scoutingapp.R;
import scouting.sciguy429.com.scoutingapp.Utilities.H2SQL;

public class MainActivity extends AppCompatActivity {

    final String TAG = "ScoutingApp";
    //final String ServerBTMAC = "00:50:F2:7E:80:91";

    Boolean storage = true;

    TextView status;
    Button initButton;
    Button startButton;

    //BluetoothDevice ServerBTDevice = null;
    //BluetoothSocket mmSocket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            storage = false;
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);
        }

        status = findViewById(R.id.status);

        initButton = findViewById(R.id.initServer);
        initButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteRecursive(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS) + "/DB/"));
                new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS) + "/DB/").mkdirs();

                H2SQL H2SQL = new H2SQL();
                H2SQL.initializeDatabase();
                startButton.setAlpha(1.0F);
                startButton.setClickable(true);
                status.setText("Server Valid");
            }
        });

        startButton = findViewById(R.id.start);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainMenuActivity.class));
            }
        });

        if (storage) {
            storage = false;
            if (new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS) + "/DB/", "scouting.mv.db").exists()) {
                startButton.setAlpha(1.0F);
                startButton.setClickable(true);
                status.setText("Server Valid");
            } else {
                startButton.setAlpha(0.5F);
                startButton.setClickable(false);
                status.setText("Server Not Initialized");
            }
        }

        /*
        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (mBluetoothAdapter == null) {
            // Device doesn't support Bluetooth
            Toast.makeText(this, "Device Dose Not Support Bluetooth", Toast.LENGTH_LONG).show();
        }
        //if (!mBluetoothAdapter.isEnabled()) {
        //    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        //    startActivityForResult(enableBtIntent, 1);
        //}
        Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();

        if (pairedDevices.size() > 0) {
            // There are paired devices. Get the name and address of each paired device.
            for (BluetoothDevice device : pairedDevices) {
                String deviceName = device.getName();
                String deviceHardwareAddress = device.getAddress(); // MAC address
                Log.d(TAG, deviceName + " : " + deviceHardwareAddress + " : " + deviceHardwareAddress.equals(ServerBTMAC));
                if (deviceHardwareAddress.equals(ServerBTMAC)) {
                    ServerBTDevice = device;
                }
            }
        }
        if (ServerBTDevice != null) {
            try {
                mmSocket = ServerBTDevice.createRfcommSocketToServiceRecord(UUID.fromString("05f71850-17bd-4805-a32d-d5e22be90d6d"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                // Connect to the remote device through the socket. This call blocks
                // until it succeeds or throws an exception.
                mmSocket.connect();
            } catch (IOException connectException) {
                // Unable to connect; close the socket and return.
                try {
                    mmSocket.close();
                } catch (IOException closeException) {
                    Log.e(TAG, "Could not close the client socket", closeException);
                }
            }
            try {
                mmSocket.getOutputStream().write("This is a string boi".getBytes());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mmSocket.getOutputStream().write("This is a second string boi".getBytes());
                //mmSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */
    }
    void deleteRecursive(File fileOrDirectory) {
        if (fileOrDirectory.isDirectory())
            for (File child : fileOrDirectory.listFiles())
                deleteRecursive(child);

        fileOrDirectory.delete();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.importDatabse:
                //todo this
                return true;
            case R.id.exportDatabase:
                //todo this
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 0: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    storage = true;
                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.

                } else {
                    System.exit(0);
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request.
        }
    }
}
