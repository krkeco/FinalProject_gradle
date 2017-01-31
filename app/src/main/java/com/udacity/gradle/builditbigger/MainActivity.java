package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.JokePro;
import com.example.jokedroid.JokeDroidActivity;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;


public class MainActivity extends AppCompatActivity {
    JokePro jokelib = new JokePro();
   static Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();


    }



       public static <T> T echo(T o) {
            return echo(o, false);
        }

      public static <T> T echo(T o, boolean log) {
            if (log) Log.i(MainActivity.class.getName(), o.toString());

            return o;
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

    public void tellJoke(View view) {
        String joke = jokelib.getJoke();
        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();

        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, joke));

        /*prior to gcm this sent the data to the androidlib for display
        Intent intent = new Intent(MainActivity.this, JokeDroidActivity.class);
        intent.putExtra("joke",joke);
        MainActivity.this.startActivity(intent);*/

    }

    public static void receiveData(String result){
        Intent intent = new Intent(mContext, JokeDroidActivity.class);
        intent.putExtra("joke",result);
        mContext.startActivity(intent.addFlags(FLAG_ACTIVITY_NEW_TASK));

    }
}
