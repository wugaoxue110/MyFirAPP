package com.xue.myfirapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

class MyAdapter extends FragmentPagerAdapter {

    private List<String> list;
    public MyAdapter(FragmentManager fm, List<String> list) {
        super(fm);

        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {

        return myFragment.newInstance(list.get(position)) ;
    }



    @Override
    public int getCount() {
        return list.size();

    }
}
