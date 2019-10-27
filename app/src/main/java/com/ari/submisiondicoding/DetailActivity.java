package com.ari.submisiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "Detail Activity";

    TextView tvnamahewan, tvdetailhewan, tvasalhewan;
    ImageView ivgambarhewan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namahewan = getIntent().getStringExtra("DataNama");
        int gambarhewana = getIntent().getIntExtra("DataGambar", 0);
        String detailhewan = getIntent().getStringExtra("DetailHewan");
        String asalhewan = getIntent().getStringExtra("AsalHewan");

        //log

        Log.d(TAG, "Nama :"+ namahewan);
        Log.d(TAG,"Gambar :"+ gambarhewana);
        Log.d(TAG,"Detail :"+ detailhewan);
        Log.d(TAG, "Tanggal"+ asalhewan);

        tvnamahewan = findViewById(R.id.tv_item_nama);
        ivgambarhewan = findViewById(R.id.iv_item_gambar);
        tvdetailhewan = findViewById(R.id.tv_detail_hewan);
        tvasalhewan = findViewById(R.id.tv_asal_hewan);

        tvnamahewan.setText(namahewan);
        ivgambarhewan.setImageResource(gambarhewana);
        tvdetailhewan.setText(detailhewan);
        tvasalhewan.setText(asalhewan);


    }

}
