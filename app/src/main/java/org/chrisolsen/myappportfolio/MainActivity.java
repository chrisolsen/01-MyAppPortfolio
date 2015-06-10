package org.chrisolsen.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();
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
        Toast.makeText(mContext, "This button will launch Spotify!", Toast.LENGTH_SHORT).show();
    }

    public void openScores(View view) {
        Toast.makeText(this, "This button will launch Scores App!", Toast.LENGTH_SHORT).show();
    }

    public void openLibrary(View view) {
        Toast.makeText(this, "This button will launch Library App!", Toast.LENGTH_SHORT).show();
    }

    public void openBuildItBigger(View view) {
        Toast.makeText(this, "This button will launch Build it Bigger!", Toast.LENGTH_SHORT).show();
    }

    public void openXYZReader(View view) {
        Toast.makeText(this, "This button will launch XYZ Reader!", Toast.LENGTH_SHORT).show();
    }

    public void openCapstone(View view) {
        Toast.makeText(this, "This button will launch Capstone!", Toast.LENGTH_SHORT).show();
    }
}
