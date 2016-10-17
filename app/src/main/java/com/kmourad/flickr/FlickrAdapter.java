package com.kmourad.flickr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FlickrAdapter extends BaseAdapter {
    Context context;
    List<String> list = new ArrayList<String>();

    // deux listes

    public FlickrAdapter(Context ctx){
        context = ctx;
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("cccccc");
        list.add("ddddd");
        list.add("eeeee");
        list.add("fffff");
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
