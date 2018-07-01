package com.example.hp.recycler;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {


        private List<Movies> MoviesList;

        public class ViewHolder extends RecyclerView.ViewHolder {
            public TextView title, year, genre;

            public ImageView image;

            public ViewHolder(View view) {
                super(view);
                title = (TextView) view.findViewById(R.id.title);
                year = (TextView) view.findViewById(R.id.year);
                genre = (TextView) view.findViewById(R.id.genre);

                image =(ImageView) view.findViewById(R.id.image);
            }
        }

        public MoviesAdapter(List<Movies> MoviesList) {
            this.MoviesList = MoviesList;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View View = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);

            return new ViewHolder(View);

        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            Movies movies = MoviesList.get(position);
            holder.title.setText(Movies.getTitle());
            holder.genre.setText(Movies.getGenre());
            holder.year.setText(Movies.getYear());
            holder.image.setImageResource(movies.getimage());



        }

        @Override
        public int getItemCount() {
            return MoviesList.size();
        }
    }

}
