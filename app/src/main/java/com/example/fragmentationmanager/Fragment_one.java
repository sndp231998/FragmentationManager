package com.example.fragmentationmanager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment_one extends Fragment {

    private EditText number1EditText;
    private EditText number2EditText;
    private Button addButton;


    public Fragment_one() {
        // Required empty public constructor
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        number1EditText = view.findViewById(R.id.number1EditText);
        number2EditText = view.findViewById(R.id.number2EditText);
        addButton = view.findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(number1EditText.getText().toString());
                int number2 = Integer.parseInt(number2EditText.getText().toString());

                // Pass the numbers to the result fragment
                Fragment_two resultFragment = new Fragment_two();
                Bundle bundle = new Bundle();
                bundle.putInt("number1", number1);
                bundle.putInt("number2", number2);
                resultFragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, resultFragment)
                        .commit();
            }
        });

        return view;
    }
}