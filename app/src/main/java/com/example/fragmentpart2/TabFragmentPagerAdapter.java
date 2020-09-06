package com.example.fragmentpart2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    String[]title=new String[]{"HOME","DOLPHIN","SHARK","WHALE"};

    public TabFragmentPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Fragment fragment=new HomeFragment();
                return fragment;
            case 1:
                Fragment fragment1=new DolphinFragment();
                return fragment1;
            case 2:
                Fragment fragment2=new SharkFragment();
                return fragment2;
            case 3:
                Fragment fragment3=new WhalesFragment();
                return fragment3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
