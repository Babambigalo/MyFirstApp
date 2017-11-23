package com.example.android.myfirstapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nmatveev on 10.11.2017.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public MyFragmentPagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new ParksFragment();
        } else if (position == 1) {
            return new MuseumsFragment();

        } else if (position == 2) {

            return new TheatersFragment();
        } else {
            return new MonumentsFragment();

        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_parks);
            case 1:
                return mContext.getString(R.string.category_museums);
            case 2:
                return mContext.getString(R.string.category_theaters);
            case 3:
                return mContext.getString(R.string.category_monuments);
                default:
                    return null;
        }
    }
}
