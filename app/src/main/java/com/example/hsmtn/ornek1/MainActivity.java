package com.example.hsmtn.ornek1;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    LinearLayout ll;
    Button bK, bY, bElips, bYuvarlak;
    TextView tvfontlu;
    Typeface fontumuz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bK=(Button) findViewById(R.id.bKir);
        bY=(Button) findViewById(R.id.bYes);
        ll=(LinearLayout) findViewById(R.id.ll);
        bElips=(Button) findViewById(R.id.button7);

        fontumuz=Typeface.createFromAsset(getAssets(), "fontlar/Starfish.ttf");
        tvfontlu=(TextView) findViewById(R.id.textView6);
        tvfontlu.setTypeface(fontumuz);

        //final Intent t= new Intent(getApplicationContext(),tableLayout.class);
        final Intent t=new Intent(MainActivity.this,tableLayout.class);
        final  Intent i=new Intent(getApplicationContext(),linearActivity.class);


        bK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll.setBackgroundColor(Color.RED);
            }
        });

        bY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(t);
            }
        });

        bElips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });

    }
}
