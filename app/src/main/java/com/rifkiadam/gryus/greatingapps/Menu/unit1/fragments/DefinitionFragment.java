package com.rifkiadam.gryus.greatingapps.Menu.unit1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rifkiadam.gryus.greatingapps.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DefinitionFragment extends Fragment {


    public DefinitionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_definition, container, false);
    }

}