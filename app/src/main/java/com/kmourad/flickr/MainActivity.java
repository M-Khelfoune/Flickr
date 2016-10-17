package com.kmourad.flickr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.kmourad.flickr.R.id.list;

public class MainActivity extends AppCompatActivity {
    FlickrAdapter flickrAdapter;
    int idxListCurrent = 1;
    List<String> currentList = new ArrayList<String>();
    List<String> list = new ArrayList<String>();
    List<String> list2= new ArrayList<String>();

    private View.OnClickListener updateList = new View.OnClickListener() {
        public void onClick(View view) {
            switch (idxListCurrent){
                case 1 : currentList = list2;
                    idxListCurrent = 2;
                    break;
                case 2 : currentList = list;
                    idxListCurrent = 1;
                    break;
            }
            flickrAdapter.setList(currentList);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createList();

        ListView listView = (ListView) findViewById(R.id.list);
        flickrAdapter = new FlickrAdapter(this, currentList);
        listView.setAdapter(flickrAdapter);

        Button b = (Button) findViewById(R.id.btn_start);
        b.setOnClickListener(updateList);
    }

    private void createList(){
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("cccccc");
        list.add("ddddd");
        list.add("eeeee");
        list.add("fffff");

        list2.add("aaaaa 22222");
        list2.add("bbbbb 22222");
        list2.add("cccccc 22222");
        list2.add("ddddd 2222");
        list2.add("eeeee 2222");
        list2.add("fffff 2222");

        currentList = list;
    }

}
