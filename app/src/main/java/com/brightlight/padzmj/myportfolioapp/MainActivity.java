package com.brightlight.padzmj.myportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView firstApp, secondApp, thirdApp, fourthApp, fifthApp, sixthApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstApp = (TextView) findViewById(R.id.firstApp);
        secondApp = (TextView) findViewById(R.id.secondApp);
        thirdApp = (TextView) findViewById(R.id.thirdApp);
        fourthApp = (TextView) findViewById(R.id.fourthApp);
        fifthApp = (TextView) findViewById(R.id.fifthApp);
        sixthApp = (TextView) findViewById(R.id.sixthApp);

        firstApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the first App", Toast.LENGTH_SHORT).show();
            }
        });

        secondApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the second App", Toast.LENGTH_SHORT).show();
            }
        });

        thirdApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the third App", Toast.LENGTH_SHORT).show();
            }
        });

        fourthApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the fourth App", Toast.LENGTH_SHORT).show();
            }
        });

        fifthApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the fifth App", Toast.LENGTH_SHORT).show();
            }
        });

        sixthApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the sixth App", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
