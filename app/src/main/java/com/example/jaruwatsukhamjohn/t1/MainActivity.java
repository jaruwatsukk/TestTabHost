package com.example.jaruwatsukhamjohn.t1;

import android.app.ActionBar;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends FragmentActivity {

    public static final String KEY_DRAWABLE_ID = "drawableId";

    private ActionBarDrawerToggle mDrawerToggle;
    private String[] mDrawerTitle;
    private DrawerLayout mDrawerLayout;
    private ListView mListView;
    private FragmentTabHost mTabHost;
    private ActionBar actionBar;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

}
