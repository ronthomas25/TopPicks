package com.ron.toppicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent=new Intent(this,Toppicks.class);

        ImageSlider imageSlider = findViewById(R.id.slider);
        final int munnar_img[] ={R.drawable.munnar};

        final List<toppicksdata> toppicksdata=new ArrayList<>();
        toppicksdata.add(new toppicksdata(munnar_img,"Munnar","kerala,India","hello",9.9312,76.2673,4.0));

        List<SlideModel> slideModels =new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.munnar,""));
        slideModels.add(new SlideModel(R.drawable.munnar,""));
        slideModels.add(new SlideModel(R.drawable.munnar,""));
        imageSlider.setImageList(slideModels, true);

        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {

                if(i == 0){

                    bundle.putSerializable("data", (Serializable) toppicksdata);
                    intent.putExtra("position",0);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }

            }
        });

    }
}