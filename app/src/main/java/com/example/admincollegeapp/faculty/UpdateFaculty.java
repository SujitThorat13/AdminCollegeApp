package com.example.admincollegeapp.faculty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.admincollegeapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class UpdateFaculty extends AppCompatActivity {

    FloatingActionButton fab;
    private RecyclerView csDepartment,informationDepartment, mechanicalDepartment, electricalDepartment;
    private LinearLayout csNoData, infoNoData, mechNoData, elctNoData;
    private List<TeacherData> list1, list2, list3, list4;

    private DatabaseReference reference, dbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_faculty);

        csDepartment = findViewById(R.id.csDepartment);
        informationDepartment = findViewById(R.id.informationDepartment);
        mechanicalDepartment = findViewById(R.id.mechanicalDepartment);
        electricalDepartment = findViewById(R.id.electricalDepartment);


        csNoData = findViewById(R.id.csNoData);
        infoNoData = findViewById(R.id.infoNoData);
        mechNoData = findViewById(R.id.mechNoData);
        elctNoData = findViewById(R.id.elctNoData);

        reference = FirebaseDatabase.getInstance().getReference().child("teacher");


        csDepartment();

        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UpdateFaculty.this, AddTeachers.class));
            }
        });

    }

    private void csDepartment() {
        dbRef = reference.child("Computer Engineering");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
              /*  Toast.makeText(UpdateFaculty.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();*/
            }
        });
    }
}