package com.aaamab.delivery.vovo.ui.splashview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.aaamab.delivery.vovo.R;
import com.aaamab.delivery.vovo.databinding.ActivitySplashBinding;
import com.aaamab.delivery.vovo.ui.loginpage.LoginActivity;
import com.aaamab.delivery.vovo.ui.navpage.NavActivity;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class SplashActivity extends AppCompatActivity {
    ActivitySplashBinding binding ;
    Handler handler ;
    ShimmerLayout shimmerLayout ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_splash);
        shimmerLayout = binding.shimmerText;
        shimmerLayout.startShimmerAnimation();
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), NavActivity.class));
                finish();
            }
        }, 5000L);
    }
}
