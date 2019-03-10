package com.rifkiadam.gryus.greatingapps.Menu.unit1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.rifkiadam.gryus.greatingapps.MainActivity;
import com.rifkiadam.gryus.greatingapps.R;

public class Unit1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1);


        ImageButton imgButton = findViewById(R.id.beranda);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Unit1Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
