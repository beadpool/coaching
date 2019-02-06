package com.example.arjuna.for_coaching.Adapter;


import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.arjuna.for_coaching.R;
import com.example.arjuna.for_coaching.content.Veg;

import java.util.ArrayList;

public class StudentlistAdapter extends RecyclerView.Adapter<StudentlistAdapter.Myholder> {
    ArrayList<Veg> arrayList;
    FragmentActivity activity;


    public class Myholder extends RecyclerView.ViewHolder {


        public TextView Name,Rollnumber,Class;
        public Button Edit,Delete;
        public ImageView image;
        public LinearLayout studentlist;
        public Myholder(@NonNull View view) {

            super(view);
            Name = (TextView) view.findViewById(R.id.Name);
            Rollnumber = (TextView) view.findViewById(R.id.Rollnumber);
            Class = (TextView) view.findViewById(R.id.Class);
            Edit=(Button)view.findViewById(R.id.Edit);
            Delete=(Button)view.findViewById(R.id.Delete);

            image=(ImageView)view.findViewById(R.id.imge);
            studentlist=(LinearLayout)view.findViewById(R.id.studentlist);



        }
    }
    public StudentlistAdapter(ArrayList<Veg> arrayList, FragmentActivity activity) {
           this.activity=activity;
          this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.studentlistlayout,viewGroup, false);

        return new Myholder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull Myholder myholder, int i) {
        final Veg c = arrayList.get(i);
        myholder.Name.setText(c.getName());
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}