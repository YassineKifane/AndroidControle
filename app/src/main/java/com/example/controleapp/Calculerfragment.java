package com.example.controleapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Calculerfragment extends Fragment {
    private EditText txt;
    private Button btn;
    private TextView res;
    public Calculerfragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculerfragment, container, false);


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculerfragment, container, false);

    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        txt =  view.findViewById(R.id.t1);
        btn =  view.findViewById(R.id.button);
        res =  view.findViewById(R.id.res);

        btn.setOnClickListener( v -> {
            float euro = Float.parseFloat(txt.getText().toString());
            float mad = euro*11.13F;
            res.setText(String.valueOf(mad)+" Mad");
        });
    }
}