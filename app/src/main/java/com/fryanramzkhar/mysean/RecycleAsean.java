package com.fryanramzkhar.mysean;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleAsean extends AppCompatActivity {

    @BindView(R.id.my_recycle_asean)
    RecyclerView myRecycleAsean;

    String[] namaAsean,detailAsean;
    int[] gambarAsean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_asean);
        ButterKnife.bind(this);

        namaAsean = getResources().getStringArray(R.array.nama_negara);
        detailAsean =getResources().getStringArray(R.array.detail_asean);
        gambarAsean = new int[]{R.drawable.indonesia,R.drawable.malaysia,R.drawable.singapura,R.drawable.thailand,R.drawable.laos,R.drawable.kamboja,R.drawable.brunei,R.drawable.filipina,R.drawable.vietnam,R.drawable.mynmar};

        Adapter adapter = new Adapter(RecycleAsean.this,gambarAsean,namaAsean,detailAsean);
        myRecycleAsean.setHasFixedSize(true);
        myRecycleAsean.setLayoutManager(new LinearLayoutManager(RecycleAsean.this));
        myRecycleAsean.setAdapter(adapter);
    }
}
