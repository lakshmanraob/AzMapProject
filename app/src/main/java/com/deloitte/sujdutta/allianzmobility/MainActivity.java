package com.deloitte.sujdutta.allianzmobility;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.deloitte.sujdutta.findmycarlibrary.view.FindMyCarView;


public class MainActivity extends AppCompatActivity {

    private Button archiveBtn, infoBtn, backBtn;
    private TextView heading;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                v = new FindMyCarView(MainActivity.this,getSupportFragmentManager());
                setContentView(v);
            }
        });


    }
}