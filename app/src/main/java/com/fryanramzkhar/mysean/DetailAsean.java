package com.fryanramzkhar.mysean;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailAsean extends AppCompatActivity {

    @BindView(R.id.imgAsean)
    ImageView imgAsean;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_asean);
        ButterKnife.bind(this);

        txtTitle.setText(getIntent().getStringExtra("na"));
        txtDetail.setText(getIntent().getStringExtra("da"));
        Glide.with(this).load(getIntent().getIntExtra("ga",0)).into(imgAsean);
    }
}
