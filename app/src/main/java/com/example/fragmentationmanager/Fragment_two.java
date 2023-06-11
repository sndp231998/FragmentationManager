package com.example.fragmentationmanager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_two extends Fragment {

    private TextView resultTextView;

    public Fragment_two() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        resultTextView = view.findViewById(R.id.resultTextView);

        // Retrieve the numbers from the input fragment
        Bundle bundle = getArguments();
        if (bundle != null) {
            int number1 = bundle.getInt("number1");
            int number2 = bundle.getInt("number2");

            int result = number1 + number2;

            resultTextView.setText(String.valueOf(result));
        }

        return view;
    }
}