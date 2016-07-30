package com.moataz.myportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MyPortfolioFragment extends Fragment {

    public MyPortfolioFragment() {
    }

    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView =  inflater.inflate(R.layout.fragment_my_portfolio, container, false);


        Button btPM =(Button) rootView.findViewById(R.id.bt_pm);
        Button btSH =(Button) rootView.findViewById(R.id.bt_sh);
        Button btBIB =(Button) rootView.findViewById(R.id.bt_bib);
        Button btMYAM =(Button) rootView.findViewById(R.id.bt_myam);
        Button btGU =(Button) rootView.findViewById(R.id.bt_gu);
        Button btCF =(Button) rootView.findViewById(R.id.bt_cf);


        btPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "This button will launch the popular movies app!", Toast.LENGTH_SHORT).show();
            }
        });

        btSH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "This button will launch the stock hawk app!", Toast.LENGTH_SHORT).show();
            }
        });

        btBIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "This button will launch the build it bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        btMYAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "This button will launch the make your app material app!", Toast.LENGTH_SHORT).show();
            }
        });


        btGU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "This button will launch the go ubiquitous app!", Toast.LENGTH_SHORT).show();
            }
        });


        btCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
            }
        });


    return rootView;
    }
}
