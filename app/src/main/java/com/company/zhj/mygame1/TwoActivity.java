package com.company.zhj.mygame1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TwoActivity extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);
    }

    public void bearYes(View view) {
        Intent intent = new Intent();
        intent.setClass(TwoActivity.this,ThreeActivity.class);
        startActivity(intent);
    }

    public void No(View view) {
        Intent intent = new Intent();
        intent.setClass(TwoActivity.this,DefeatActivity.class);
        startActivity(intent);
    }
}
