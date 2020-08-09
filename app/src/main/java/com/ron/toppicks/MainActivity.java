package com.ron.toppicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.io.ByteArrayOutputStream;
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

        final int munnar_img[] = {R.drawable.munnar,R.drawable.munnar};

        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {
                if(i==0){

                    Intent intent = new Intent(MainActivity.this, Toppicks.class);
                    startActivity(intent);
                    setContentView(R.layout.activity_toppicks);
                }
                else if(i==1){
                    Intent intent = new Intent(MainActivity.this, Toppicks.class);
                    startActivity(intent);
                    setContentView(R.layout.top_picks2);
                }
                else if(i==2){
                    Intent intent = new Intent(MainActivity.this, Toppicks.class);
                    startActivity(intent);
                    setContentView(R.layout.top_picks3);
                }
            }
        });


    }
}