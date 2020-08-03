package com.ron.toppicks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.slider);

        List<SlideModel> slideModels =new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.munnar,""));
        slideModels.add(new SlideModel(R.drawable.munnar,""));
        slideModels.add(new SlideModel(R.drawable.munnar,""));
        imageSlider.setImageList(slideModels, true);



    }
}