package com.ari.submisiondicoding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListAdapter extends ArrayAdapter{
    private Context context;
    private String[] namaHewan, asalHewan;
    private int[] gambarHewan;

    ListAdapter(@NonNull Context context1, String[] namaHewan, int[] gambarHewan, String[] asalHewan) {
        super(context1, R.layout.item_hewan, namaHewan);
        this.context = context1;
        this.namaHewan = namaHewan;
        this.gambarHewan = gambarHewan;
        this.asalHewan = asalHewan;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //layout item
        LayoutInflater layoutInflater;
        View view = LayoutInflater.from(context).inflate(R.layout.item_hewan, parent, false);

        //findbyid
        TextView tvNamaHewan = view.findViewById(R.id.tv_item_nama);
        ImageView ivGambarHewan = view.findViewById(R.id.iv_item_gambar);
        TextView tvTanggalPahlawan = view.findViewById(R.id.tv_asal_hewan);

        //set data
        tvNamaHewan.setText(namaHewan[position]);
        ivGambarHewan.setImageResource(gambarHewan[position]);
        tvTanggalPahlawan.setText(asalHewan[position]);

        return view;
    }
}
