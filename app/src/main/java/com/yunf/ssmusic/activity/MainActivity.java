package com.yunf.ssmusic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.yunf.ssmusic.R;
import com.yunf.ssmusic.fragment.MainFragment;
import com.yunf.ssmusic.widget.CustomViewPager;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {
    private ActionBar ab;
    private ImageView barnet, barmusic, barfriends, search;
    private ArrayList<ImageView> tabs = new ArrayList<>();
    private DrawerLayout drawerLayout;
    private ListView mLvLeftMenu;
    private long time = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLvLeftMenu = (ListView) findViewById(R.id.id_lv_left_menu);
        setToolBar();
    }

    private void setToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setTitle("");
    }

//    private void setViewPager() {
//        tabs.add(barnet);
//        tabs.add(barmusic);
//        final CustomViewPager customViewPager = (CustomViewPager) findViewById(R.id.main_viewpager);
//        final MainFragment mainFragment = new MainFragment();
//        final TabNetPagerFragment tabNetPagerFragment = new TabNetPagerFragment();
//        CustomViewPagerAdapter customViewPagerAdapter = new CustomViewPagerAdapter(getSupportFragmentManager());
//        customViewPagerAdapter.addFragment(tabNetPagerFragment);
//        customViewPagerAdapter.addFragment(mainFragment);
//        customViewPager.setAdapter(customViewPagerAdapter);
//        customViewPager.setCurrentItem(1);
//        barmusic.setSelected(true);
//        customViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                switchTabs(position);
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
//
//        barnet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                customViewPager.setCurrentItem(0);
//            }
//        });
//        barmusic.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                customViewPager.setCurrentItem(1);
//            }
//        });
//
//        search.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Intent intent = new Intent(MainActivity.this, NetSearchWordsActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
//                MainActivity.this.startActivity(intent);
//            }
//        });
//    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: //Menu icon
                drawerLayout.openDrawer(Gravity.LEFT);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
