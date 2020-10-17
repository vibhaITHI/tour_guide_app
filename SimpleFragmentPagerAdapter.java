package com.example.dhrumilshah.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SimpleFragmentPagerAdapter  extends FragmentStatePagerAdapter{

    private Context mContext;
    SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new HistoryFragment();
        else if(position == 1)
            return new AttractionFragment();
        else if(position == 2)
            return new HaveliFragment();
        else
            return new StreetFoodFragment();
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return mContext.getString(R.string.title_history);
            case 1:
                return mContext.getString(R.string.title_attraction);
            case 2:
                return mContext.getString(R.string.title_haveli);
            case 3:
                return mContext.getString(R.string.title_street_food);
            default:
                return null;
        }
    }
}

