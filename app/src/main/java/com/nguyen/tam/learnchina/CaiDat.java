package com.nguyen.tam.learnchina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CaiDat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dat);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
