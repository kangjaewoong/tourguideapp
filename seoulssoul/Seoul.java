package com.example.android.seoulssoul;

import static android.R.attr.name;

/**
 * Created by Jaewoong on 2017-08-10.
 */

public class Seoul {

    private String mPlaceName;

    private String mPlaceAddress;

    private String mPlaceDescription;

    private String mPlaceWebPage;

    private String mPlaceLocation;

    private int mPlaceImageId;

    //constructor

    public Seoul (int image, String name, String address, String description, String webPage, String location) {
        mPlaceName = name;
        mPlaceAddress = address;
        mPlaceDescription = description;
        mPlaceWebPage = webPage;
        mPlaceLocation = location;
        mPlaceImageId = image;
    }

    //getters
    public String getName(){
        return mPlaceName;
    }

    public String getAddress(){
        return mPlaceAddress;
    }

    public String getDescription(){
        return mPlaceDescription;
    }

    public String getWebPage(){
        return mPlaceWebPage;
    }

    public String getLocation(){
        return mPlaceLocation;
    }

    public int getImage(){
        return mPlaceImageId;
    }
}
