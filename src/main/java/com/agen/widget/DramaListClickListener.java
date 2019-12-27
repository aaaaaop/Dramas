package com.agen.widget;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.agen.handleDramas.DramasPageActivity;
import com.agen.handleDramas.DramasStringHandle;


public class DramaListClickListener implements AdapterView.OnItemClickListener {
    private final String[] listItemNames;
    private final Context mContext;
    private static final String TAG = "DramaListClickListener";

   public DramaListClickListener(Context context, String[] listRowNames) {
            this.mContext = context;
            this.listItemNames = listRowNames;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent(this.mContext, DramasPageActivity.class);

        if (listItemNames[position].equals(DramasStringHandle.dramas1)) {
            Toast.makeText(mContext,"dramas1", Toast.LENGTH_SHORT).show();
            //intent.putExtra("BMI_EXTRA", bmi);
            mContext.startActivity(intent);
            return;
        }
        else if (listItemNames[position].equals(DramasStringHandle.dramas2)) {
            Toast.makeText(mContext,"dramas2", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            Toast.makeText(mContext,"dramas other", Toast.LENGTH_SHORT).show();
            return;
        }
     }
}
