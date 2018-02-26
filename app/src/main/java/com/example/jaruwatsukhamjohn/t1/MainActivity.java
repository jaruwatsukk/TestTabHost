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




public class MainActivity extends FragmentActivity  {

    public static final String KEY_DRAWABLE_ID = "drawableId";

    private ActionBarDrawerToggle mDrawerToggle;
    private String[] mDrawerTitle;
    private DrawerLayout mDrawerLayout;
    private ListView mListView;
    private FragmentTabHost mTabHost;
    private ActionBar actionBar;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println("-------------- test pull request");

        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator("A1", null),
                FragmentTab.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("A2", null),
                FragmentTab.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab3").setIndicator("A3", null),
                FragmentTab.class, null);

        mTabHost.setVisibility(View.INVISIBLE);

        mDrawerTitle = getResources().getStringArray(R.array.main);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mListView = (ListView) findViewById(R.id.drawer);



        // TEST 1232312312
        
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        mDrawerToggle = new ActionBarDrawerToggle(
                this,   // Context
                mDrawerLayout,  // DrawerLayout
                R.drawable.ic_drawer,  // รูปภาพที่จะใช้
                R.string.drawer_open, // ค่า String ในไฟล์ strings.xml
                R.string.drawer_close // ค่า String ในไฟล์ strings.xml
        ) {

            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                invalidateOptionsMenu();
            }

            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
            }

        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mDrawerTitle);

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_LONG).show();
                selectFragment(position);
            }
        });
        /*selectFragment(0);*/
    }

    private void selectFragment(int position) {

        switch (position) {
            case 0:
                    mTabHost.clearAllTabs();
                    mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
                    mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

                    mTabHost.addTab(
                            mTabHost.newTabSpec("tab1").setIndicator("A1", null),
                            FragmentTab.class, null);
                    mTabHost.addTab(
                            mTabHost.newTabSpec("tab2").setIndicator("A2", null),
                            FragmentTab.class, null);
                    mTabHost.addTab(
                            mTabHost.newTabSpec("tab3").setIndicator("A3", null),
                            FragmentTab.class, null);
                    mTabHost.addTab(
                            mTabHost.newTabSpec("tab3").setIndicator("A4", null),
                            FragmentTab.class, null);
                    mTabHost.setVisibility(View.VISIBLE);
                break;
            case 1:
                mTabHost.clearAllTabs();
                mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
                mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

                mTabHost.addTab(
                        mTabHost.newTabSpec("tab1").setIndicator("B1", null),
                        FragmentTab.class, null);
                mTabHost.addTab(
                        mTabHost.newTabSpec("tab2").setIndicator("B2", null),
                        FragmentTab.class, null);
                mTabHost.addTab(
                        mTabHost.newTabSpec("tab3").setIndicator("B3", null),
                        FragmentTab.class, null);
                mTabHost.addTab(
                        mTabHost.newTabSpec("tab3").setIndicator("B4", null),
                        FragmentTab.class, null);
                mTabHost.setVisibility(View.VISIBLE);
                break;
            case 2:
                mTabHost.clearAllTabs();
                mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
                mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

                mTabHost.addTab(
                        mTabHost.newTabSpec("tab1").setIndicator("C1", null),
                        FragmentTab.class, null);
                mTabHost.addTab(
                        mTabHost.newTabSpec("tab2").setIndicator("C2", null),
                        FragmentTab.class, null);
                mTabHost.addTab(
                        mTabHost.newTabSpec("tab3").setIndicator("C3", null),
                        FragmentTab.class, null);
                mTabHost.addTab(
                        mTabHost.newTabSpec("tab3").setIndicator("C4", null),
                        FragmentTab.class, null);
                mTabHost.setVisibility(View.VISIBLE);
                break;
            case 3:
                mTabHost.clearAllTabs();
                mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
                mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

                mTabHost.addTab(
                        mTabHost.newTabSpec("tab1").setIndicator("D1", null),
                        FragmentTab.class, null);
                mTabHost.addTab(
                        mTabHost.newTabSpec("tab2").setIndicator("D2", null),
                        FragmentTab.class, null);
                mTabHost.addTab(
                        mTabHost.newTabSpec("tab3").setIndicator("D3", null),
                        FragmentTab.class, null);
                mTabHost.addTab(
                        mTabHost.newTabSpec("tab3").setIndicator("D4", null),
                        FragmentTab.class, null);
                mTabHost.setVisibility(View.VISIBLE);
                break;
            default:
                break;

        }

        mListView.setItemChecked(position, true);
        setTitle(mDrawerTitle[position]);
        mDrawerLayout.closeDrawer(mListView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // If the nav drawer is open, hide action items related to the content view
        boolean drawerOpen = mDrawerLayout.isDrawerOpen(mListView);
        menu.findItem(R.id.action_websearch).setVisible(!drawerOpen);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        // ActionBarDrawerToggle will take care of this.
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        // Handle action buttons
        switch(item.getItemId()) {
            case R.id.action_websearch:
                // create intent to perform web search for this planet
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, getActionBar().getTitle());
                // catch event that there's no activity to handle intent
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(this, R.string.app_not_available, Toast.LENGTH_LONG).show();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
