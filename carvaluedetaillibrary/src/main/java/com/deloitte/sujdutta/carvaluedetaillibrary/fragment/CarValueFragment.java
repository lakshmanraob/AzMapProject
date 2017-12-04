package com.deloitte.sujdutta.carvaluedetaillibrary.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deloitte.sujdutta.carvaluedetaillibrary.R;

/**
 * Created by sujdutta on 11/28/17.
 */

public class CarValueFragment extends Fragment {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fr_car_value, container, false);
        return view;
    }
}
