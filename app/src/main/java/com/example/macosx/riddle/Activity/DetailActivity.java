package com.example.macosx.riddle.Activity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.macosx.riddle.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //inisialisasi data dari internet
        ImageView ivGambarBuah = findViewById(R.id.ivGambarBuah);
        TextView tvNamaBuah = findViewById(R.id.tvNamaBuah);
        //tangkap data dari intent
        String nama_Buah = getIntent().getStringExtra("NM_BUAH");
        int gambar_buah = getIntent().getIntExtra("GB_BUAH", 0);

        //set data ke widget
        ivGambarBuah.setImageResource(gambar_buah);
        tvNamaBuah.setText(nama_Buah);

    }
}
