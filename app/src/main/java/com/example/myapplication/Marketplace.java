package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Marketplace extends AppCompatActivity {
    ImageView points_section;
    ImageView Artisan;
    ImageView Points_Exchange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_marketplace);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        points_section = findViewById(R.id.imageView23);
        points_section.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Home_Page.class);
            startActivity(intent);
        });
        Artisan = findViewById(R.id.imageView25);
        Artisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Artisan.class);
                startActivity(intent);
            }
        });
        Points_Exchange = findViewById(R.id.imageView16);
        Points_Exchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Points_Exchange.class);
                startActivity(intent);
            }
        });
    }
}