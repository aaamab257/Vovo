package com.aaamab.delivery.vovo.ui.navpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aaamab.delivery.vovo.R;
import com.aaamab.delivery.vovo.databinding.ActivityNavBinding;
import com.aaamab.delivery.vovo.ui.loginpage.LoginActivity;

public class NavActivity extends AppCompatActivity {
    ActivityNavBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this ,R.layout.activity_nav);
        binding.btnDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavActivity.this , LoginActivity.class));
                finish();
            }
        });
        binding.btnPat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavActivity.this , LoginActivity.class));
                finish();
            }
        });
    }
}
