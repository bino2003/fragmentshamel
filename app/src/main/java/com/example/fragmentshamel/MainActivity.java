package com.example.fragmentshamel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.fragmentshamel.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        ArrayList<String> stringArrayList=new ArrayList<>();
        ArrayList<Fragment> fragmentArrayList=new ArrayList<>();
        stringArrayList.add("photos");
        stringArrayList.add("videws");

        fragmentArrayList.add(videwspostsfragment.newInstance());
        fragmentArrayList.add(photopostsfragment.newInstance());
        FragmentAdapter f=new FragmentAdapter(this,fragmentArrayList);
        binding.ViewPager.setAdapter(f);
        new TabLayoutMediator(binding.tab, binding.ViewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
            tab.setText(stringArrayList.get(position));
            }
        }).attach(); ;


    }
}