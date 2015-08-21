package com.appifiedtech.androidtablayoutexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FragmentB extends Fragment {


    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;

    public FragmentB() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerViewAdapter = new RecyclerViewAdapter(getItems());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    public ArrayList<String> getItems(){
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0;i<100;i++)
        {
            list.add("Item-"+i);
        }
        return list;
    }
}
