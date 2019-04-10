package com.example.purchasetabview;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import static android.support.constraint.Constraints.TAG;

public class KarnatakaFragment extends Fragment {

    View view;
    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private Context mContext;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      view = inflater.inflate(R.layout.fragment_karnataka, container, false);

        initImageBitmaps();
        return view;
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://www.trawell.in/admin/images/upload/073237688Badami_Main.jpg");
        mNames.add("Badami");

        mImageUrls.add("http://www.transindiatravels.com/wp-content/uploads/mysore-palace2.jpg");
        mNames.add("Mysore Palace");

        mImageUrls.add("http://www.indiatravelblog.com/attachments/Resources/3686-25-Shimsha-tourist-place-in-Karnataka.jpg");
        mNames.add("Shimsha");

        mImageUrls.add("https://www.tourmyindia.com/blog/wp-content/uploads/2015/11/best-things-to-do-in-coorg.jpg");
        mNames.add("Coorg");


        mImageUrls.add("https://static.toiimg.com/photo/62914405.cms.cms");
        mNames.add("Hampi");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");


        // get the reference of RecyclerView
        RecyclerView recyclerView =(RecyclerView) view.findViewById(R.id.recycler_karnataka);
        // set a StaggeredGridLayoutManager with 3 number of columns and vertical orientation
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        Log.d("debugMode", "The application stopped after this");
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter( getContext(), mNames, mImageUrls);
        recyclerView.setAdapter(adapter);

    }
}
