package com.agen.dramassample;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.agen.widget.DramaListAdapter;
import com.agen.widget.DramaListClickListener;
import com.agen.handleDramas.DramasStringHandle;
import com.agen.dramassample.R;

public class DramasActivity extends Activity {

    private ListView mDramaListView;
    private DramaListAdapter mDramaListAdapter; // for handling main activity list items
    private String[] mDramaListRowNames = {DramasStringHandle.dramas1,DramasStringHandle.dramas2,
                                           DramasStringHandle.dramas3,DramasStringHandle.dramas4,
                                           DramasStringHandle.dramas5,DramasStringHandle.dramas6};

    private String testHitHub ="testHitHub";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dramas);

        mDramaListAdapter = new DramaListAdapter(this, mDramaListRowNames);
        mDramaListView = (ListView) findViewById(R.id.drama_list);
        mDramaListView.setAdapter(mDramaListAdapter);
        mDramaListView.setOnItemClickListener(new DramaListClickListener(this, mDramaListRowNames));

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
