package com.company.zhj.mygame1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Defeat1 extends BaseActivity {
    private Button buttonEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.defeat2);

        buttonEnd=findViewById(R.id.button_defeat2);

        buttonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
            }
        });
    }

    public void restart(View view) {
        Intent intent = new Intent();
        intent.setClass(Defeat1.this,TwoActivity.class);
        startActivity(intent);
    }
}
