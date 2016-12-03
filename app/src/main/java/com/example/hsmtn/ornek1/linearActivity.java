package com.example.hsmtn.ornek1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class linearActivity extends Activity {


    Intent m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear);

        m=new Intent(getApplicationContext(),MainActivity.class);
    }

    public  void  maineGit(View v){
        startActivity(m);
    }
}
