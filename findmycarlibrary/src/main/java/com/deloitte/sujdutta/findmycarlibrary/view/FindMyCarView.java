package com.deloitte.sujdutta.findmycarlibrary.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.deloitte.sujdutta.findmycarlibrary.R;
import com.deloitte.sujdutta.findmycarlibrary.activity.MapsActivity;


/**
 * Created by sujdutta on 11/27/17.
 */

public class FindMyCarView extends ScrollView {


    private Button archiveBtn,infoBtn,backBtn;
    private TextView heading;
    private Toolbar mToolbar;

    FragmentManager fragmentManger;
    Activity act ;

    public FindMyCarView(Context context, FragmentManager fragmentManager) {
        super(context);
        this.fragmentManger=fragmentManager;
        initialize(context);
        act=(Activity)context;
        //act.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //act.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    public FindMyCarView(Context context, AttributeSet attrs) {
        super(context);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.find_car_view, this);


        /*FindMyCarFragment f1 = new FindMyCarFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManger.beginTransaction();
        fragmentTransaction.replace(R.id.replace_lyt, f1);
        fragmentTransaction.commit();*/

        Intent newIntent = new Intent(context, MapsActivity.class);
        newIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(newIntent);


    }
}
