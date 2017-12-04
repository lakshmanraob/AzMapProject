package com.deloitte.sujdutta.carvaluedetaillibrary.view;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.deloitte.sujdutta.carvaluedetaillibrary.R;
import com.deloitte.sujdutta.carvaluedetaillibrary.fragment.CarValueFragment;

/**
 * Created by sujdutta on 11/28/17.
 */

public class CarValueView extends ScrollView {

    FragmentManager fragmentManger;
    Activity act ;

    public CarValueView(Context context, FragmentManager fragmentManager) {
        super(context);
        this.fragmentManger=fragmentManager;
        initialize(context);
        act=(Activity)context;
        //act.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //act.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    public CarValueView(Context context, AttributeSet attrs) {
        super(context);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.car_value_view, this);



        CarValueFragment f1 = new CarValueFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManger.beginTransaction();
        fragmentTransaction.replace(R.id.replace_lyt, f1);
        fragmentTransaction.commit();

    }
}
