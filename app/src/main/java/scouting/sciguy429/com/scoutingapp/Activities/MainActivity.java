package scouting.sciguy429.com.scoutingapp.Activities;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.util.Set;
import java.util.UUID;

import scouting.sciguy429.com.scoutingapp.R;

public class MainActivity extends AppCompatActivity {

    final String TAG = "ScoutingApp";
    final String ServerBTMAC = "00:50:F2:7E:80:91";

    Button loginButton;

    BluetoothDevice ServerBTDevice = null;
    BluetoothSocket mmSocket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainMenuActivity.class));
            }
        });

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
    }
}
