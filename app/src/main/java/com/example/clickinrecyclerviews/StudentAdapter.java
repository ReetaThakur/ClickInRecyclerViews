package com.example.clickinrecyclerviews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter  extends RecyclerView.Adapter<StudentHolder> {
    private ArrayList<StudentModel> studentModels;
    private StudentInterface studentInterface;
    public StudentAdapter(ArrayList<StudentModel>studentModels,StudentInterface studentInterface){
        this.studentModels=studentModels;
        this.studentInterface=studentInterface;

    }
    @NonNull
    @Override
    public StudentHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.student_layout,parent,false);
        return new StudentHolder(view,studentInterface);
    }

    @Override
    public void onBindViewHolder( StudentHolder holder, int position) {
        StudentModel studentModel=studentModels.get(position);
        holder.setData(studentModel);

    }

    @Override
    public int getItemCount() {
        return studentModels.size();
    }
}
