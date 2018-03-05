package com.example.macosx.riddle.Activity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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
        TextView detail_Buah = findViewById(R.id.isiDetail);
        Button btnJawaban = findViewById(R.id.btnjawaban);
        final TextView txtJawaban = findViewById(R.id.txtjawaban);
        //tangkap data dari intent
        String nama_Buah = getIntent().getStringExtra("NM_BUAH");
        int gambar_buah = getIntent().getIntExtra("GB_BUAH", 0);
        int detail_buah = getIntent().getIntExtra("detail_buah",0);
        final int jawaban = getIntent().getIntExtra("Jawaban",0);

        //set data ke widget
        ivGambarBuah.setImageResource(gambar_buah);
        tvNamaBuah.setText(nama_Buah);
        detail_Buah.setText(detail_buah);
        txtJawaban.setText(jawaban);

        btnJawaban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtJawaban.setVisibility(View.VISIBLE);


            }
        });


    }
}
