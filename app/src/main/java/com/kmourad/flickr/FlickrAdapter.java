package com.kmourad.flickr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.kmourad.flickr.R.id.list;

public class FlickrAdapter extends BaseAdapter {
    Context context;
    List list;


    // deux listes

    public FlickrAdapter(Context ctx, List list){
        context = ctx;
        this.list = list;

    }

    public void setList(List list){
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater
                    .from(context)
                    .inflate(R.layout.row_layout, parent, false);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.text);
        textView.setText((String)(getItem(position)));
        return convertView;
    }
}
