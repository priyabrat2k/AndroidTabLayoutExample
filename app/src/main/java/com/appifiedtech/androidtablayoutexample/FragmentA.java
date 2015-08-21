package com.appifiedtech.androidtablayoutexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    private ListView listView;

    public FragmentA() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        listView = (ListView)view.findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,getItems());
        listView.setAdapter(arrayAdapter);
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
