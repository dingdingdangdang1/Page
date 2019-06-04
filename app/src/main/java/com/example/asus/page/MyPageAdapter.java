package com.example.asus.page;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


    public class MyPageAdapter extends FragmentPagerAdapter {

        public MyPageAdapter(FragmentManager fm){
            super(fm);
        }


        @Override
        public CharSequence getPageTitle(int position) {
            if(position==0){
                return "荷花";
            }else if(position==1){
                return "水仙";
            }else{
                return "金银花";
            }
        }

        @Override
        public Fragment getItem(int position) {
            if(position==0){
                return new FirstFragment();
            }else if(position==1){
                return new SecondFragment();
            }else{
                return new ThirdFragment();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

