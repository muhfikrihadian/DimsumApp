package com.example.restoapp.features;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restoapp.R;
import com.example.restoapp.features.home.HomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileRegisterActivity extends AppCompatActivity {
    @BindView(R.id.ivProfile)
    ImageView ivProfile;
    @BindView(R.id.btnAdd)
    ImageView btnAdd;
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.btnNext)
    Button btnNext;
    @BindView(R.id.btnLater)
    Button btnLater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_register);
        ButterKnife.bind(this);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileRegisterActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        btnLater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileRegisterActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}