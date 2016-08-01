package com.example.administrator.customerview;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //ActionBar actionBar = getActionBar();
       // actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getActionBar().hide();
//        LinearLayout root = (LinearLayout) findViewById(R.id.root);
//        final DrawView draw  =  new DrawView(this);
//        draw.setMinimumWidth(300);
//        draw.setMinimumHeight(500);
//        root.addView(draw);

    }
}
