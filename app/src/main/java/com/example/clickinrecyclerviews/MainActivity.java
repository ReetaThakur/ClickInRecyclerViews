package com.example.clickinrecyclerviews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements StudentInterface{
    ArrayList<StudentModel>studentModels=new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        buildDataForAdapter();
        setData();

    }
    private void buildDataForAdapter(){
        for(int i=0;i<50;i++){
            studentModels.add(new StudentModel("Reeta Thakur",26,
                    "Bina (M.P)","2/09/1995",R.drawable.shailee));
            studentModels.add(new StudentModel("Rupali Mishra",25,
                    "Bhopal (M.P)","21/07/1996",R.drawable.rupali));

            studentModels.add(new StudentModel("Shailee Sharma",22,
                    "Banglore ","2/11/200",R.drawable.student));

            studentModels.add(new StudentModel("Rahul verma",27,
                    "Indore (M.P)","21/02/1994",R.drawable.boystudent));
        }
    }
    private void setData(){
        StudentAdapter studentAdapter=new StudentAdapter(studentModels,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }


    @Override
    public void onClick(StudentModel model) {

        AlertDialog alertDialog=new AlertDialog.Builder(this)
                .setTitle("Student Information")
                .setMessage(model.getName()+"\n"+model.getAge()+"\n"
                +model.getDOB()+"\n"+model.getAddress()).show();

    }
}