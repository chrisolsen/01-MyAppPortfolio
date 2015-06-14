package org.chrisolsen.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Context Context;
    Toast Message;

    private void showMessageToUser(String msg) {
        if (Message == null) {
            Message = Toast.makeText(Context, null, Toast.LENGTH_SHORT);
        }

        Message.setText(msg);
        Message.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context = getApplicationContext();
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


    public void openSpotify(View view) {
        showMessageToUser("This button will launch Spotify!");
    }

    public void openScores(View view) {
        showMessageToUser("This button will launch Scores App!");
    }

    public void openLibrary(View view) {
        showMessageToUser("This button will launch Library App!");
    }

    public void openBuildItBigger(View view) {
        showMessageToUser("This button will launch Build it Bigger!");
    }

    public void openXYZReader(View view) {
        showMessageToUser("This button will launch XYZ Reader!");
    }

    public void openCapstone(View view) {
        showMessageToUser("This button will launch Capstone!");
    }
}
