package com.agen.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.agen.dramassample.R;

public class DramaListAdapter extends ArrayAdapter<String> {
    private final Context mContext;
    private final String[] mListItemNames;


    class BTListItemViewHolder {
        TextView text;
    }

    public DramaListAdapter(Context context, String[] values ) {
        super(context, R.layout.dramas_list_item, values);
        this.mContext = context;
        this.mListItemNames = values;
    }

    @Override
    public int getCount() {
        return mListItemNames.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        BTListItemViewHolder viewHolder;

        LayoutInflater layoutInf = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = layoutInf.inflate(R.layout.dramas_list_item, null);
            viewHolder = new BTListItemViewHolder();
            viewHolder.text = (TextView) convertView.findViewById(R.id.textViewListItem);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (BTListItemViewHolder) convertView.getTag();
        }
        viewHolder.text.setText(mListItemNames[position]);

        return convertView;
    }
}
