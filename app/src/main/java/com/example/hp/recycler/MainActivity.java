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
    private MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView)findViewById(R.id.recycle);

        moviesAdapter = new MoviesAdapter(movieList);


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(mLayoutManager);
        recycler.setItemAnimator(new DefaultItemAnimator());
        recycler.setAdapter(moviesAdapter);

        MovieData();
    }

    private void MovieData() {

        Movies movie = new Movies ("Angry Birds", "Funny", "2016");
        movie.setImage(R.drawable.agrybird);
        movieList.add(movie);

        movie = new Movies("Raees", "Drama_Action", "2017");
        movie.setImage(R.drawable.raeess);
        movieList.add(movie);

        movie = new Movies("Baahubali 2", "Action", "2017");
        movie.setImage(R.drawable.baahu);

        movieList.add(movie);

        movie = new Movies("Tiger Zinda Hai", "Action", "2017");
        movie.setImage(R.drawable.tigr);

        movieList.add(movie);

        movie = new Movies("Moonlight", "Action", "2016");
        movie.setImage(R.drawable.mnlgt );

        movieList.add(movie);
    }
}



