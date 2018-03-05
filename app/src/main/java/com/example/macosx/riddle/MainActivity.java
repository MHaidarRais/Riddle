package com.example.macosx.riddle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.macosx.riddle.Adapter.RecyclerDaftarAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvDaftar;

    String[] namaBuah= {"Kemampuan Anak ku","Makan Malam",
                        "Perampokan","Selangkah Menjadi Dokter",
                        "Berburu Hantu","Cerita Website","Liburan Panjang","Bebas Penjara",
                        "Kisah Sang Tentara","Email Terakhir","Perampokan Bank"};
    int[] gambarBuah = {R.drawable.child,R.drawable.dinner,R.drawable.robb,
                        R.drawable.dokter,R.drawable.school,R.drawable.website,R.drawable.hotel,
                        R.drawable.jail,R.drawable.tentara,R.drawable.email,
                        R.drawable.robbery};
    int[] detail = {R.string.cerita_bocah,R.string.cerita_makanmalam,
                    R.string.cerita_perampokan,R.string.cerita_Dokter,
                    R.string.cerita_berburu,R.string.cerita_website,R.string.cerita_liburan,R.string.cerita_penjara,
                    R.string.cerita_tentara,R.string.cerita_email_terakhir,R.string.cerita_perampokanbank};
    int[] jawaban = {R.string.jawaban_cerita_bocah,R.string.jawaban_cerita_makanmalam,
                    R.string.jawaban_cerita_perampokan,R.string.jawaban_cerita_dokter,
                    R.string.jawaban_cerita_berburu,R.string.jawaban_cerita_website,R.string.jawaban_cerita_liburan,
                    R.string.jawaban_cerita_penjara,R.string.jawaban_cerita_tentara,R.string.jawaban_cerita_email_terakhir,
                    R.string.jawaban_cerita_perampokanbank};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvDaftar = findViewById(R.id.rvDaftar);

        RecyclerDaftarAdapter adapter = new RecyclerDaftarAdapter(this, namaBuah,gambarBuah,detail,jawaban);



        //set adapter ke widget
        rvDaftar.setAdapter(adapter);
        //set layout manager
        rvDaftar.setLayoutManager(new LinearLayoutManager(this));
    }
}
