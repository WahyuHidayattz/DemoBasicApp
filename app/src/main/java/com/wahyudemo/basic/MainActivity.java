package com.wahyudemo.basic;

import android.os.*;
import android.support.design.widget.*;
import android.support.v7.app.*;
import android.view.*;
import android.view.View.*;

public class MainActivity extends AppCompatActivity
{

    private FloatingActionButton mFab;
    private CoordinatorLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLayout = findViewById(R.id.main_layout);
        mFab = findViewById(R.id.fab);

        mFab.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v)
                {
                    Snackbar.make(mLayout, "Replace your own action", Snackbar.LENGTH_SHORT).show();
                }
            });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case R.id.menu_item:
                Snackbar.make(mLayout, "Replace your own action", Snackbar.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
