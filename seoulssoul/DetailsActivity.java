package com.example.android.seoulssoul;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jaewoong on 2017-08-14.
 */

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
    }

    ImageView imageView = (ImageView)findViewById(R.id.detail_image);
    imageView.setImageResource();

    TextView detailName = (TextView)findViewById(R.id.detail_name);
    detailName.setText();

    TextView detailDescripton = (TextView)findViewById(R.id.detail_description);
    detailDescripton.setText();
}
