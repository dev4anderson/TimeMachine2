package com.example.rm31308.timemachine.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.rm31308.timemachine.fragments.CarrosFragment;

/**
 * Created by rm31308 on 19/11/2016.
 */
public class TabAdapter extends FragmentStatePagerAdapter{

    public static final int TOTAL_TABS = 2;

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Bundle bundle = new Bundle();

        if (position == 0){
            bundle.putString("tipo", "classicos");
        }else{
            bundle.putString("tipo", "esportivos");
        }

        Fragment f = new CarrosFragment();
        f.setArguments(bundle);
        return f;
    }

    @Override
    public int getCount() {
        return TOTAL_TABS;
    }
}
