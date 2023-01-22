package com.example.tes_dosen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class MainActivity extends AppCompatActivity {
    RecyclerView recylerView;
    String s1[], s2[],s3[];
    int images[] = {
            R.drawable.beat,
            R.drawable.cbr,
            R.drawable.klx,
            R.drawable.ninja,
            R.drawable.supra,
            R.drawable.vario,
            R.drawable.vega,
            R.drawable.vespa};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.Nama);
        s2 = getResources().getStringArray(R.array.Harga);
        s3 = getResources().getStringArray(R.array.Tahun);
        NamaAdapter appAdapter = new NamaAdapter(this,s1,s2,s3,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}