package com.fryanramzkhar.mysean;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    int[] gambarAsean;
    String[] namaAsean, detailAsean;

    public Adapter(Context context, int[] gambarAsean, String[] namaAsean, String[] detailAsean) {
        this.context = context;
        this.gambarAsean = gambarAsean;
        this.namaAsean = namaAsean;
        this.detailAsean = detailAsean;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_asean, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, final int i) {
        viewHolder.txtAsean.setText(namaAsean[i]);
        Glide.with(context).load(gambarAsean[i]).into(viewHolder.imgAsean);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, DetailAsean.class);
                pindah.putExtra("na",namaAsean[i]);
                pindah.putExtra("da",detailAsean[i]);
                pindah.putExtra("ga",gambarAsean[i]);
                context.startActivity(pindah);
            }
        });

    }

    @Override
    public int getItemCount() {
        return gambarAsean.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAsean;
        TextView txtAsean;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAsean = itemView.findViewById(R.id.imgList);
            txtAsean = itemView.findViewById(R.id.txtListTitle);

        }
    }
}
