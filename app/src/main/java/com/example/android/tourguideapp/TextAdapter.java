package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TextAdapter extends ArrayAdapter<Text> {


    public TextAdapter( Context context,  ArrayList<Text> texts) {
        super(context, 0, texts);
    }

    public View getView(int position, View view, ViewGroup parent){
        View listItemView = view;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Text currentText = getItem(position);

        TextView nameTextView =listItemView.findViewById(R.id.name_text);
        nameTextView.setText(currentText.getRestaurantName());

        TextView addressTextView =listItemView.findViewById(R.id.address_container);
        addressTextView.setText(currentText.getRestaurantAddress());

        ImageView imageView =listItemView.findViewById(R.id.image);
        if (currentText.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentText.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }



        return listItemView;

    }


}
