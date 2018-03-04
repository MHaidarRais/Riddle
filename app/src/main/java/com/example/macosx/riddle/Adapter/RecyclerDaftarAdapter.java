package com.example.macosx.riddle.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.macosx.riddle.Activity.DetailActivity;
import com.example.macosx.riddle.R;


public class RecyclerDaftarAdapter extends RecyclerView.Adapter<RecyclerDaftarAdapter.BuahViewHolder> {
    Context context;
    String[] nama;
    int[] gambar;
    public RecyclerDaftarAdapter(Context context,  String[] nama, int[] gambar) {
        this.context = context;

       this.nama = nama;
       this.gambar = gambar;

    }

    @Override
    public RecyclerDaftarAdapter.BuahViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_daftarv2, parent, false);

        BuahViewHolder holder = new BuahViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(BuahViewHolder holder, final int position) {
// set nilai ke widget
        holder.ivGambarBuah.setImageResource(gambar[position]);
        holder.tvNamaBuah.setText(nama[position]);
//beri event onClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//pindah ke activity detail
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("NM_BUAH", nama[position]);
                intent.putExtra("GB_BUAH", gambar[position]);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return nama.length;
    }

    public class BuahViewHolder extends RecyclerView.ViewHolder {
        ImageView ivGambarBuah;
        TextView tvNamaBuah;


        public BuahViewHolder(View itemView) {
            super(itemView);
//inisialisasi
            ivGambarBuah = itemView.findViewById(R.id.imgBuah);
            tvNamaBuah = itemView.findViewById(R.id.txtNamaBuah);

        }
    }
}

