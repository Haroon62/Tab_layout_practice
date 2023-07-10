package com.example.tab_layout_practice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.transition.MaterialElevationScale;

public class View_page_adaptor extends FragmentPagerAdapter {
    public View_page_adaptor(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0) {
            return new Chat_fragment();
        }
        else if (position==1) {
            return new Status_fragment();

        }else
            return new Cals_fragment();
    }

    @Override
    public int getCount() {
        return 3;


    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0)
            return "CHATS";
        else if (position==1)
            return "STATUS";
        else
            return "CALS";
    }
}
