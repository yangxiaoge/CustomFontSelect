package com.yang.bruce.changecustomfont;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 缅甸文字体 zawgyi-one
        FontHelper.applyFont(this, findViewById(R.id.activity_main_root), "font/zawgyi.ttf");
        //FontHelper.applyFont(this, findViewById(R.id.activity_main_root), "font/ChanticleerRomanNF.ttf");

        //吐司字体无效
        //Toast.makeText(this, "စာရြက္စာတမ္းအေရအတြက္", Toast.LENGTH_LONG).show();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NormalActivity.class));
            }
        });
    }
}
