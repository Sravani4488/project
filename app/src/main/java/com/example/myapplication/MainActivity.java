package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<modified> modifiedArrayList=new ArrayList<>();
    adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new adapter(this,modifiedArrayList);
        recyclerView.setAdapter(adapter);

        populateRecyclerView();
    }
    public void populateRecyclerView(){
        modified modified=new modified(2, 5);
        modifiedArrayList.add(modified);
        adapter.notifyDataSetChanged();
    }
}