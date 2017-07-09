package com.example.android.newsapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lukas on 2017-07-09.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> news) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentPost = getItem(position);


        TextView titleText = (TextView) listItemView.findViewById(R.id.listTitle);

        titleText.setText(currentPost.getTitle());

        TextView SelectionText = (TextView) listItemView.findViewById(R.id.listSelection);

        SelectionText.setText(currentPost.getSelection());

        TextView Date = (TextView) listItemView.findViewById(R.id.listDate);

        TextView Time = (TextView) listItemView.findViewById(R.id.listTime);

        String DateTime = currentPost.getDate();

        String dateString = DateTime.substring(0, 10);

        String timeString = DateTime.substring(11, 16);

        Date.setText(dateString);

        Time.setText(timeString);


        return listItemView;

    }


}
