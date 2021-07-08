package com.example.clickinrecyclerviews;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class StudentHolder extends RecyclerView.ViewHolder {

    private ImageView studentImage;
    private TextView name;
    private TextView age;
    private TextView DOB;
    private TextView address;
    private StudentInterface studentInterface;
    private ConstraintLayout constraintLayout;
    public StudentHolder(View itemView,StudentInterface studentInterface) {
        super(itemView);
        this.studentInterface=studentInterface;
        initViews(itemView,studentInterface);
    }
    private void initViews(View itemView,StudentInterface studentInterface){
        studentImage=itemView.findViewById(R.id.image);
        name=itemView.findViewById(R.id.name);
        age=itemView.findViewById(R.id.age);
        DOB=itemView.findViewById(R.id.dateofbirth);
        address=itemView.findViewById(R.id.address);
        constraintLayout=itemView.findViewById(R.id.constraintLayout);
    }
    public void setData(StudentModel studentModel){
        studentImage.setImageResource(studentModel.getImageId());
        name.setText(studentModel.getName());
        age.setText(studentModel.getAge()+"");
        DOB.setText(studentModel.getDOB());
        address.setText(studentModel.getAddress());
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             studentInterface.onClick(studentModel);
            }
        });
    }
}
