package com.ron.toppicks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.List;

public class Toppicks extends AppCompatActivity {


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Toppicks.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toppicks);

        String placename,desc,state;
        float rating,lat,lon;
        int img[];

        ImageView placeimg=findViewById(R.id.placeimg);
        TextView state_country=findViewById(R.id.state);
        CollapsingToolbarLayout collapsingToolbarLayout=findViewById(R.id.collapsinglayout);
        RatingBar ratingBar=findViewById(R.id.ratingBar);
        TextView rating_textview=findViewById(R.id.rating);

        Intent intent=getIntent();
        Bundle bundle=getIntent().getExtras();
        List<toppicksdata> toppicksdata= (List<com.ron.toppicks.toppicksdata>) bundle.getSerializable("data");
        int pos=intent.getIntExtra("position",0);

       placeimg.setImageResource(toppicksdata.get(pos).getImg(0));
       state_country.setText(toppicksdata.get(pos).getState());
       collapsingToolbarLayout.setTitle(toppicksdata.get(pos).getPlace());
       rating_textview.setText(toppicksdata.get(pos).getRating()+"");
       ratingBar.setRating(toppicksdata.get(pos).getRating());
       lat=toppicksdata.get(pos).getLat();
       lon=toppicksdata.get(pos).getLon();
       final String uri="geo:"+lat+"," +lon+ "?q="+lat+","+lon+"";

       ImageView gps=findViewById(R.id.gps_icon);
        gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                 startActivity(i);
            }
        });



    }
}