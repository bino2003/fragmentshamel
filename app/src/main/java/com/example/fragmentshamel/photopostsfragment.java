package com.example.fragmentshamel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentshamel.databinding.FragmentPhotopostsfragmentBinding;

import java.util.ArrayList;


public class photopostsfragment extends Fragment {


    public photopostsfragment() {
        // Required empty public constructor
    }




    public static photopostsfragment newInstance() {
        photopostsfragment fragment = new photopostsfragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
FragmentPhotopostsfragmentBinding binding= FragmentPhotopostsfragmentBinding.inflate(inflater,container,false);
Posts posts=new Posts("https://www.bing.com/ck/a?!&&p=0cc9a7925b6c9d37JmltdHM9MTY5NDgyMjQwMCZpZ3VpZD0xNjU3MTgwYS05NzA2LTYzZmItMGVlOC0wYWI1OTYzMTYyOTAmaW5zaWQ9NTYzOQ&ptn=3&hsh=3&fclid=1657180a-9706-63fb-0ee8-0ab596316290&u=a1L2ltYWdlcy9zZWFyY2g_cT3YtdmI2LEg2YLYt9i3JkZPUk09SVFGUkJBJmlkPUZDNDJBQ0Q1N0M5RjNDODQzNkYxQzlCNTA3ODdFQkM1NjRFMDkxMkM&ntb=1","photos");
        ArrayList<Posts> postsArrayList=new ArrayList<>();
        postsArrayList.add(posts);
PostAdapter postAdapter=new PostAdapter(getActivity(),postsArrayList);
binding.rvPhotos.setAdapter(postAdapter);
binding.rvPhotos.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));

        return binding.getRoot();
    }
}