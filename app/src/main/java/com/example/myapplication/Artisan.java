package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Artisan extends AppCompatActivity {

    ImageView points_section;
    ImageView Marketplace;
    int[] images = {R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic, R.drawable.hd_man_user_illustration_icon_transparent_png_701751694974843ybexneueic};

    String[] version = {"Leo", "Nemo", "Ben", "Ted", "Jake", "Finn", "Ash", "Dan", "Liam", "Noah", "Oliver", "William", "James", "Logan"};

    String[] versionNumber = {"Painter", "Sculptor", "Painter", "Designer", "Creator", "Inventor", "Painter", "Sculptor", "Painter", "Designer", "Creator", "Inventor", "Painter", "Sculptor"};

    ListView lView;

    ListAdapter lAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_artisan);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Marketplace = findViewById(R.id.imageView34);
        Marketplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Marketplace.class);
                startActivity(intent);
            }
        });
        points_section = findViewById(R.id.imageView31);
        points_section.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Home_Page.class);
            startActivity(intent);
        });
        lView = (ListView) findViewById(R.id.androidList);

        lAdapter = new ListAdapter(getApplicationContext(), version, versionNumber, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), version[i]+" "+versionNumber[i], Toast.LENGTH_SHORT).show();

            }
        });
    }
}