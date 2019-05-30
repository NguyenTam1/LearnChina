package com.nguyen.tam.learnchina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Activity_10_BaiHoiThoaiCoBan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10__bai_hoi_thoai_co_ban);
        this.setTitle("10 Bài đàm thoại cấp 1");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
