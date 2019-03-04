package com.company.zhj.mygame1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class DefeatActivity extends BaseActivity {
    private Button buttonEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.defeat);

        buttonEnd=findViewById(R.id.button_defeatend);

        buttonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
            }
        });
    }

    public void restart(View view) {
        Intent intent = new Intent();
        intent.setClass(DefeatActivity.this,TwoActivity.class);
        startActivity(intent);
    }
}
