package com.example.todolist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    private StringAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //link to the xml file in the layout
        setContentView(R.layout.activity_main);


        //set up adapter

        mAdapter = new StringAdapter(this, R.layout.list_item, R.id.list_item_textView);

        ListView listView = (ListView) findViewById(R.id.activity_main_listview);
        listView.setAdapter(mAdapter);
    }
}
