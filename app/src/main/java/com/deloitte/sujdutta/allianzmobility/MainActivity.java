package com.deloitte.sujdutta.allianzmobility;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.deloitte.sujdutta.findmycarlibrary.fragment.AzMapFragment;


public class MainActivity extends AppCompatActivity {

    private Button archiveBtn, infoBtn, backBtn;
    private TextView heading;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        archiveBtn = (Button) findViewById(R.id.toolbar).findViewById(R.id.archive_btn);
        backBtn = (Button) findViewById(R.id.toolbar).findViewById(R.id.img_back);
        infoBtn = (Button) findViewById(R.id.toolbar).findViewById(R.id.info_btn);
        heading = (TextView) findViewById(R.id.toolbar).findViewById(R.id.page_heading);
        archiveBtn.setVisibility(View.INVISIBLE);
        heading.setText(getResources().getString(R.string.find_my_car));
        backBtn.setVisibility(View.VISIBLE);
                /*v = new FindMyCarView(MainActivity.this,getSupportFragmentManager());
                setContentView(v);*/

                AzMapFragment f1 = new AzMapFragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.replace_lyt, f1);
                fragmentTransaction.commit();
            }
}