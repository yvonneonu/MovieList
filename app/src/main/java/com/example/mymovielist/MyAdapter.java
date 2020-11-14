package com.example.mymovielist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.AllMovieHolder> {

    List<MyMovie> movies;
    Context context;
    MyAdapterListener myAdapterListener1;

    public MyAdapter(List<MyMovie> movie1, Context context1) {
        movies = movie1;
        context = context1;

    }

    @NonNull
    @Override
    public AllMovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.standardview,parent,false);
        return new AllMovieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllMovieHolder holder, int position) {
        MyMovie movie = movies.get(position);
        holder.name.setText(movie.getName());
        holder.description.setText(movie.getDescription());
        holder.year.setText(String.valueOf(movie.getYear()));
        holder.ratingBar.setRating(movie.getRatings());

                Glide.with(context)
                .asBitmap()
                        .load(movie.getImage())
                .placeholder(R.drawable.rampage)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }


    public class AllMovieHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        TextView year;
        RatingBar ratingBar;
        TextView description;
        CardView cardView;


        public AllMovieHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView1);
            name = itemView.findViewById(R.id.textName);
            year = itemView.findViewById(R.id.textYear);
            ratingBar = itemView.findViewById(R.id.ratingBar);
            description = itemView.findViewById(R.id.textDescription);
            cardView = itemView.findViewById(R.id.cardView);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (myAdapterListener1 !=null) {
                        //Intent intent = new Intent(context, AnotherActivity2.class);
                        int position = getAdapterPosition();
                        myAdapterListener1.movieAdapterListener(position);
                        //MyMovie movie = movies.get(position);
                        // intent.putExtra("Name", movie);
                    }

                }
            });


        }
    }

    public void CallAdapter(MyAdapterListener myAdapterListener){
        myAdapterListener1 = myAdapterListener;
    };

    public interface MyAdapterListener{
        void movieAdapterListener(int position);
    }
}
