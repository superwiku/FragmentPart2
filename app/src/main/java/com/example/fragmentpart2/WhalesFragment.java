package com.example.fragmentpart2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class WhalesFragment extends Fragment {
    ImageView imgWhales;
       public WhalesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_whales, container, false);
        imgWhales=(ImageView)view.findViewById(R.id.img_whales);
        imgWhales.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Picasso.with(getContext()).load("https://cdn.pixabay.com/photo/2016/11/22/19/33/animal-1850235_960_720.jpg").into(imgWhales);
    }
}