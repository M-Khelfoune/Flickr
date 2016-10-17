package com.kmourad.flickr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.kmourad.flickr.R.id.list;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);
        FlickrAdapter adapter = new FlickrAdapter(this);
        listView.setAdapter(adapter);

    }
}
