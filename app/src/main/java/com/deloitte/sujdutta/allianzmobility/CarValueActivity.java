package com.deloitte.sujdutta.allianzmobility;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.deloitte.sujdutta.carvaluedetaillibrary.view.CarValueView;

/**
 * Created by sujdutta on 11/28/17.
 */

public class CarValueActivity extends AppCompatActivity {

    private Button archiveBtn, infoBtn, backBtn;
    private TextView heading;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View v = new CarValueView(this,getSupportFragmentManager());
        setContentView(v);
    }
}
