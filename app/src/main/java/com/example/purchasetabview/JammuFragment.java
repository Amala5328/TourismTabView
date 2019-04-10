package com.example.purchasetabview;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class JammuFragment extends Fragment {
    private static final String TAG = "JammuFragment";


    //vars
    View view;
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_jammu, container, false);
        initImageBitmaps();
        return view;
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://www.tourmyindia.com/blog/wp-content/uploads/2014/02/gulmarg.jpg");
        mNames.add("Gulmarg");

        mImageUrls.add("https://www.tourmyindia.com/blog/wp-content/uploads/2014/02/thiksey-monastery.jpg");
        mNames.add("Thiksey Monastery");

        mImageUrls.add("https://images.apnisanskriti.com/a/2016/09/Martand_Sun_Temple_Anantnag_Jammu_Kashmir_Temple_Inner_View-295x200.jpg");
        mNames.add("Martand Sun Temple");

        mImageUrls.add("https://d27k8xmh3cuzik.cloudfront.net/wp-content/uploads/2015/01/Srinagar.jpg");
        mNames.add("Dhal Lake");


        mImageUrls.add("https://i.ytimg.com/vi/GQKDnK-spQs/maxresdefault.jpg");
        mNames.add("Ladakh");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");


        // get the reference of RecyclerView
        RecyclerView recyclerView =(RecyclerView) view.findViewById(R.id.recycler_jammu);
        // set a StaggeredGridLayoutManager with 3 number of columns and vertical orientation
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this.getActivity());
        Log.d("debugMode", "The application stopped after this");
        recyclerView.setLayoutManager(mLayoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter( getContext(), mNames, mImageUrls);
        recyclerView.setAdapter(adapter);

    }



}
