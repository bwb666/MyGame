package com.company.zhj.mygame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startClick(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,TwoActivity.class);
        startActivity(intent);
    }
}
