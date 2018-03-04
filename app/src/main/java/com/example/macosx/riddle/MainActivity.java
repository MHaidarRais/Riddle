package com.example.macosx.riddle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.macosx.riddle.Adapter.RecyclerDaftarAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvDaftar;

    String[] namaBuah= {"Kemampuan Anak ku","Makan Malam", "Kemalingan",};
    int[] gambarBuah = {R.drawable.child,R.drawable.dinner,R.drawable.robb};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvDaftar = findViewById(R.id.rvDaftar);

        RecyclerDaftarAdapter adapter = new RecyclerDaftarAdapter(this, namaBuah,gambarBuah);



        //set adapter ke widget
        rvDaftar.setAdapter(adapter);
        //set layout manager
        rvDaftar.setLayoutManager(new LinearLayoutManager(this));
    }
}
