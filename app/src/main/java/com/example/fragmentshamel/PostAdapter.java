package com.example.fragmentshamel;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentshamel.databinding.ItempostsBinding;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostsViewHolder> {
Context context;

ArrayList<Posts> postArrayList=new ArrayList<Posts>();

    public PostAdapter(Context context, ArrayList<Posts> postArrayList) {
        this.context = context;
        this.postArrayList = postArrayList;
    }

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PostsViewHolder postsViewHolder=new PostsViewHolder(ItempostsBinding.inflate(LayoutInflater.from(parent.getContext())));

        return postsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder holder, int position) {
holder.Post.setImageURI(Uri.parse(postArrayList.get(position).image));
holder.type.setText(postArrayList.get(position).type);
    }

    @Override
    public int getItemCount() {
        return postArrayList.size();
    }
}
class PostsViewHolder extends RecyclerView.ViewHolder{
ImageView Post;
TextView type;
    public PostsViewHolder(ItempostsBinding binding) {

        super(binding.getRoot());
        type=binding.type;
        Post=binding.imageview;

    }
}