package com.anway.listiva;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements AddMultipleItems.OnFragmentInteractionListener, ShoppingList.OnFragmentInteractionListener {

    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tb = (TabLayout) findViewById(R.id.appfeatures);

        tb.addTab(tb.newTab().setText("Shopping List"));
        tb.addTab(tb.newTab().setText("Add Multiple"));

        final ViewPager viewpager =(ViewPager) findViewById(R.id.viewpager1);
        final FeatureAdapter fadapter = new FeatureAdapter(getSupportFragmentManager(), tb.getTabCount());
        viewpager.setAdapter(fadapter);
        viewpager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tb));

        tb.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) { }

            @Override
            public void onTabReselected(TabLayout.Tab tab) { }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) { }
}
