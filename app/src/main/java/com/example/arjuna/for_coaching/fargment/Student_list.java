package com.example.arjuna.for_coaching.fargment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.arjuna.for_coaching.Adapter.StudentlistAdapter;
import com.example.arjuna.for_coaching.R;
import com.example.arjuna.for_coaching.content.Veg;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Student_list extends Fragment {


    public Student_list() {
        // Required empty public constructor
    }
View view;
RecyclerView rv;
Button btn;
ArrayList<Veg>  arrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_student_list, container, false);
        rv = (RecyclerView)view.findViewById(R.id.recycler_view);
        btn=(Button)view.findViewById(R.id.AddStudent);
        arrayList = new ArrayList<Veg>();
        Veg veg=null;
        veg =new Veg();
        veg.setName("Rohit");
        arrayList.add(veg);
        StudentlistAdapter studentlistAdapter=new StudentlistAdapter(arrayList,getActivity());
        rv.setAdapter(studentlistAdapter);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        return view;
    }

}
