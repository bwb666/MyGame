package com.company.zhj.mygame1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FourActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);
    }

    public void No(View view) {
        Intent intent = new Intent();
        intent.setClass(FourActivity.this,Defeat2.class);
        startActivity(intent);
    }

    public void tigerYes(View view) {
        Intent intent = new Intent();
        intent.setClass(FourActivity.this,EndActivity.class);
        startActivity(intent);
    }
}
