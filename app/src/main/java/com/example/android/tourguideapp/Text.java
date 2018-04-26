package com.example.android.tourguideapp;

public class Text {

    private int restaurantName, restaurantAddress;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int rImageResourceId = NO_IMAGE_PROVIDED;


    public Text(int restaurantName, int restaurantAddress) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
    }
    public Text(int restaurantName, int restaurantAddress,int rImageResourceId) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.rImageResourceId=rImageResourceId;
    }

    public int getRestaurantName() { return restaurantName; }

    public int getRestaurantAddress() {
        return restaurantAddress;
    }
    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return rImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return rImageResourceId != NO_IMAGE_PROVIDED;
    }
}
