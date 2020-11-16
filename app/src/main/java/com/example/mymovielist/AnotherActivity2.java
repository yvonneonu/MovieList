package com.example.mymovielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AnotherActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another2);
        ImageView image = findViewById(R.id.imageView2);
        TextView text = findViewById(R.id.textView);
        RatingBar rate = findViewById(R.id.ratingBar2);
        TextView text2 = findViewById(R.id.textView2);
        TextView text3 = findViewById(R.id.textView3);
        MyMovie movie = (MyMovie) getIntent().getSerializableExtra("Name");
        Glide.with(this).asBitmap().load(movie.getImage()).into(image);
        text.setText(movie.getName());
        rate.setRating(movie.getRatings());
        text2.setText(String.valueOf(movie.getYear()));
        text3.setText(movie.getDescription());
    }
}