package com.example.dell.navbot;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.list_recycler);
        Itemdata itemdata[]={
               new Itemdata("first","this is first picture in my app",R.drawable.a),
                new Itemdata("scont","this is first picture in my app",R.drawable.b),
                new Itemdata("first","this is first picture in my app",R.drawable.c),
                new Itemdata("scont","this is first picture in my app",R.drawable.d),
                new Itemdata("first","this is first picture in my app",R.drawable.a),
                new Itemdata("scont","this is first picture in my app",R.drawable.b),
                new Itemdata("first","this is first picture in my app",R.drawable.c),
                new Itemdata("scont","this is first picture in my app",R.drawable.d),
                new Itemdata("first","this is first picture in my app",R.drawable.a),
                new Itemdata("scont","this is first picture in my app",R.drawable.b),
                new Itemdata("first","this is first picture in my app",R.drawable.c),
                new Itemdata("scont","this is first picture in my app",R.drawable.d),
                new Itemdata("thread","this is first picture in my app",R.drawable.s)
        };

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter myAdapter=new MyAdapter(itemdata);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    public void profile(MenuItem item) {
        Toast.makeText(getApplicationContext(),"( profile )",Toast.LENGTH_SHORT).show();
    }

    public void home(MenuItem item) {
        Toast.makeText(getApplicationContext(),"( home )",Toast.LENGTH_SHORT).show();
    }

    public void setting(MenuItem item) {
        Toast.makeText(getApplicationContext(),"( setting )",Toast.LENGTH_SHORT).show();
    }
}
