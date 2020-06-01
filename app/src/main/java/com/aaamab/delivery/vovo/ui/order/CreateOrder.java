package com.aaamab.delivery.vovo.ui.order;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.aaamab.delivery.vovo.R;
import com.aaamab.delivery.vovo.databinding.ActivityCreateOrderBinding;

public class CreateOrder extends AppCompatActivity {
    ActivityCreateOrderBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_create_order);
        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
