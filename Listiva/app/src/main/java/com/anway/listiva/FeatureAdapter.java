package com.anway.listiva;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FeatureAdapter extends FragmentStatePagerAdapter {
    int noOfAdapters;

    public FeatureAdapter(FragmentManager fm, int numAdapters) {
        super(fm);
        this.noOfAdapters = numAdapters;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                ShoppingList sl = new ShoppingList();
                return sl;
            case 1:
                AddMultipleItems ami = new AddMultipleItems();
                return ami;
            default:
                return null;
        }
    }

    @Override
    public int getCount() { return noOfAdapters; }
}
