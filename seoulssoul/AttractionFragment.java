package com.example.android.seoulssoul;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionFragment extends Fragment {


    public AttractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Inflate the list
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create the ArrayList for the places
        ArrayList<Seoul> seoul = new ArrayList<Seoul>();

        //Add the places to the ArrayList
        seoul.add(new Seoul(R.drawable.palace, getString(R.string.palace_name),getString(R.string.palace_address),getString(R.string.palace_description), getString(R.string.palace_web_page), getString(R.string.palace_location)));


        SeoulAdapter adapter = new SeoulAdapter(getActivity(), seoul);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        //Return the fragment rootview
        return rootView;
    }

}
