package com.danta.sidqi.pasproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecipeActivity extends AppCompatActivity {
    TextView txtttl, txtdif, txting, txtstep;
    ImageView rcpimg;
    Bundle bundle;
    String name, dif, ing, step;
    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        txtttl = (TextView) findViewById(R.id.txtrcpname);
        txtdif = (TextView) findViewById(R.id.txtdifff);
        txting = (TextView) findViewById(R.id.txtingri);
        txtstep = (TextView) findViewById(R.id.txtsteps);
        rcpimg = (ImageView) findViewById(R.id.rcpimg);
        bundle = getIntent().getExtras();
        if (bundle != null){
            name = bundle.getString("ttl");
            dif = bundle.getString("dif");
            ing = bundle.getString("ingrid");
            step = bundle.getString("step");
            img = bundle.getInt("img");
        }
        txtttl.setText(name);
        txtdif.setText(dif);
        txting.setText(ing);
        txtstep.setText(step);
        rcpimg.setImageResource(img);


     }
}
