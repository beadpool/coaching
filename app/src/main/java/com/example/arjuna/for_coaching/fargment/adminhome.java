package com.example.arjuna.for_coaching.fargment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.arjuna.for_coaching.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class adminhome extends Fragment {


    public adminhome() {
        // Required empty public constructor
    }
    View view;
LinearLayout Studentlist;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_adminhome, container, false);

        Studentlist=(LinearLayout)view.findViewById(R.id.studentlist);
        Studentlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Student_list fragment1 = new Student_list();
                fragmentTransaction.replace(R.id.Content, fragment1, "fragment");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;
    }

}
