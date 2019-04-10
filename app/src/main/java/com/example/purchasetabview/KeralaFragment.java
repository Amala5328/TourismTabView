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


public class KeralaFragment extends Fragment {
    private static final String TAG = "KeralaFragment";
    View view;
    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private Context mContext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_kerala, container, false);


        initImageBitmaps();
        return view;
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://femina.wwmindia.com/content/2017/dec/fortkochi-kerala_1513932088_1513932093.jpg");
        mNames.add("Fort Kochi in Ernakulam");

        mImageUrls.add("https://seoimgak.mmtcdn.com/blog/sites/default/files/images/allepey.jpg");
        mNames.add("Alappuzha");

        mImageUrls.add("https://d27k8xmh3cuzik.cloudfront.net/wp-content/uploads/2014/11/Varkala-in-Kerala.jpg");
        mNames.add("Varkala in Trivandrum");

        mImageUrls.add("https://static.toiimg.com/thumb/58490225/.jpg?width=748&height=499");
        mNames.add("Munnar in Idukki");


        mImageUrls.add("https://3.bp.blogspot.com/-jD9WfZFnQx8/UtfLoCYU0MI/AAAAAAAAEVc/vxiDYpZsxUo/s1600/bekal-in-kerala.jpg");
        mNames.add("Bekal Fort in Kasaragod");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");


        // get the reference of RecyclerView
        RecyclerView recyclerView =(RecyclerView) view.findViewById(R.id.recycler_kerala);
        // set a StaggeredGridLayoutManager with 3 number of columns and vertical orientation
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this.getActivity());
        Log.d("debugMode", "The application stopped after this");
        recyclerView.setLayoutManager(mLayoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter( getContext(), mNames, mImageUrls);
        recyclerView.setAdapter(adapter);

    }

}
