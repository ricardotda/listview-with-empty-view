package com.example.listviewwithemptyview;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class MainActivity extends ListActivity implements View.OnClickListener {

    private Button clear;
    private Button set;
    private String[] versionNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = (Button) findViewById(R.id.clear);
        set = (Button) findViewById(R.id.set);

        clear.setOnClickListener(this);
        set.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.clear) {
            versionNames = new String[] {};
            setAdapter();
        } else if (v.getId() == R.id.set) {
            versionNames = getResources().getStringArray(R.array.version_names);
            setAdapter();
        }
    }

    private void setAdapter() {
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, versionNames));
    }
}