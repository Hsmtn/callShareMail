package com.example.hsmtn.ornek1;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class tableLayout extends AppCompatActivity {


    Button bCat;
    Button bYazi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        bCat=(Button) findViewById(R.id.button5);
        bYazi=(Button) findViewById(R.id.button6);


        bCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ImageView iCat=new ImageView(getApplicationContext()); //dinamik obje oluşturma
                iCat.setImageResource(R.drawable.cats);
                Toast toast=new Toast(getApplicationContext());

                toast.setGravity(5,10,20);
                toast.setView(iCat);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });

        bYazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvCat =new TextView(getApplicationContext());
                tvCat.setTextColor(Color.RED);
                tvCat.setBackgroundColor(Color.parseColor("#BF45CD"));
                tvCat.setPadding(10,5,10,5);
                tvCat.setText("Merhaba Kedicikler");
                Toast toast=new Toast(getApplicationContext());
                toast.setView(tvCat);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();

            }
        });

    }





}
