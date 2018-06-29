package com.example.hp.recycler;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private List<Movies> movieList = new ArrayList<Movies>();
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView)findViewById(R.id.recycle);

        movieAdapter = new MovieAdapter(movieList);


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(mLayoutManager);
        recycler.setItemAnimator(new DefaultItemAnimator());
        recycler.setAdapter(movieAdapter);

        MovieData();
    }

    private void MovieData() {

        Movies movie = new Movies ("Final Destination", "romance--disaster", "1997");
        movie.setImage(R.drawable.finaldestination);
        movieList.add(movie);

        movie = new Movies("Jumanji2", "action", "2018");
        movie.setImage(R.drawable.jumanji2);
        movieList.add(movie);

        movie = new Movies("Jatt&Julliet2", "Romantic", "2017");
        movie.setImage(R.drawable.jatt&julliet2);

        movieList.add(movie);

        movie = new Movies("Dil Hai Tumhara", "action", "2015");
        movie.setImage(R.drawable.Diltumhara );

        movieList.add(movie);
    }
}



