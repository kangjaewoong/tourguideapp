package com.example.android.seoulssoul;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jaewoong on 2017-08-10.
 */

public class SeoulAdapter extends ArrayAdapter<Seoul> {

    private Context context = getContext();

    public SeoulAdapter(Activity context, ArrayList<Seoul> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Seoul adapterSeoul = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(adapterSeoul.getImage());

        TextView placeNameTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        placeNameTextView.setText(adapterSeoul.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.attraction_address);
        addressTextView.setText(adapterSeoul.getAddress());




        final Intent itemIntent = new Intent(context, DetailsActivity.class);


        //Start the intent if the user taps on the list item
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });

        return listItemView;
    }
}