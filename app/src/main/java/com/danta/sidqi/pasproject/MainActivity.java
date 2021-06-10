package com.danta.sidqi.pasproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {
    CarouselView cv;
    CardView mncbtn, vgbtn, pastabtn, sfbtn;
    int[] img = {R.drawable.bolognese, R.drawable.carbonara,
            R.drawable.currysausage, R.drawable.friedrice, R.drawable.lasagna};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv = (CarouselView) findViewById(R.id.cv);
        cv.setPageCount(img.length);
        cv.setImageListener(imageListener);
        mncbtn = (CardView) findViewById(R.id.btnmnc);
        vgbtn = (CardView) findViewById(R.id.btnveggies);
        pastabtn = (CardView) findViewById(R.id.btnpasta);
        sfbtn = (CardView) findViewById(R.id.btnsf);
        final Intent move = new Intent(MainActivity.this, RvActivity.class);



        mncbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move.putExtra("num", 1);
                startActivity(move);
            }
        });

        vgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move.putExtra("num", 2);
                startActivity(move);
            }
        });

        pastabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move.putExtra("num", 3);
                startActivity(move);
            }
        });

        sfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move.putExtra("num", 4);
                startActivity(move);
            }
        });







    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(img[position]);
        }
    };
}
