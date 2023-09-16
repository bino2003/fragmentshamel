package com.example.fragmentshamel;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentStateAdapter {




        ArrayList<Fragment> fragmentArrayList;
        public FragmentAdapter(@NonNull FragmentActivity fragmentActivity, ArrayList<Fragment> fragmentArrayList) {
            super(fragmentActivity);
            this.fragmentArrayList=fragmentArrayList;
        }
        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragmentArrayList.get(position);
        }
        @Override
        public int getItemCount() {
            return fragmentArrayList.size();
        }
    }




