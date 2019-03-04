package com.company.zhj.mygame1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ThreeActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);
    }

    public void No(View view) {
        Intent intent = new Intent();
        intent.setClass(ThreeActivity.this,Defeat1.class);
        startActivity(intent);
    }

    public void rhinoYes(View view) {
        Intent intent = new Intent();
        intent.setClass(ThreeActivity.this,FourActivity.class);
        startActivity(intent);
    }
}
