package com.example.fragmentshamel;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentshamel.databinding.ItempostsBinding;

import java.util.ArrayList;


    public class VidewsAdapter extends RecyclerView.Adapter<VidewsViewHolder> {
        Context context;

        ArrayList<Posts> postArrayList=new ArrayList<Posts>();

        public VidewsAdapter(Context context, ArrayList<Posts> postArrayList) {
            this.context = context;
            this.postArrayList = postArrayList;
        }

        @NonNull
        @Override
        public com.example.fragmentshamel.VidewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            com.example.fragmentshamel.VidewsViewHolder videwsViewHolder=new com.example.fragmentshamel.VidewsViewHolder(ItempostsBinding.inflate(LayoutInflater.from(parent.getContext())));

            return videwsViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull com.example.fragmentshamel.VidewsViewHolder holder, int position) {
            holder.Post.setImageURI(Uri.parse(postArrayList.get(position).image));
            holder.type.setText(postArrayList.get(position).type);
        }

        @Override
        public int getItemCount() {
            return postArrayList.size();
        }
    }
    class VidewsViewHolder extends RecyclerView.ViewHolder{
        ImageView Post;
        TextView type;
        public VidewsViewHolder(ItempostsBinding binding) {

            super(binding.getRoot());
            type=binding.type;
            Post=binding.imageview;

        }
    }

