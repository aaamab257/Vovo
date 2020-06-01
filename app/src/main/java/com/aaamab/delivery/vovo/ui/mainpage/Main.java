package com.aaamab.delivery.vovo.ui.mainpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aaamab.delivery.vovo.R;
import com.aaamab.delivery.vovo.databinding.ActivityMainBinding;
import com.aaamab.delivery.vovo.ui.history.HistoryFragment;
import com.aaamab.delivery.vovo.ui.home.HomeFragment;

import com.aaamab.delivery.vovo.ui.order.CreateOrder;
import com.aaamab.delivery.vovo.ui.profile.ProfileFragment;
import com.aaamab.delivery.vovo.ui.search.SearchFragment;


import io.supercharge.shimmerlayout.ShimmerLayout;


import static com.aaamab.delivery.vovo.utils.AppConstant.HISTORY_PAGE;
import static com.aaamab.delivery.vovo.utils.AppConstant.HOME_page;
import static com.aaamab.delivery.vovo.utils.AppConstant.PROFILE_page;
import static com.aaamab.delivery.vovo.utils.AppConstant.SEARCH_page;

public class Main extends AppCompatActivity {
    ActivityMainBinding binding ;
    FragmentManager fragmentManager ;
    MyClickHandlers handlers ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main);
        handlers = new MyClickHandlers(this);
        binding.setHandlers(handlers);
        displayView(HOME_page);

    }

    private void displayView(int postion) {
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (postion)
        {
            case HOME_page :
                fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.replace(R.id.container, new HomeFragment());
                break;
            case PROFILE_page :
                fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.replace(R.id.container, new ProfileFragment());
                break;
            case HISTORY_PAGE :
                fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.replace(R.id.container, new HistoryFragment());
                break;
            case SEARCH_page :
                fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.replace(R.id.container, new SearchFragment());
                break;

        }
        fragmentTransaction.commit();

    }

    public class MyClickHandlers {
        Context context;

        MyClickHandlers(Context context) {
            context = this.context;
        }
        public void Home(View view){
            displayView(HOME_page);
            binding.imghome.setImageResource(R.drawable.ic_home_disactive);
            binding.imgprofile.setImageResource(R.drawable.ic_supervisor);
            binding.imgsearch.setImageResource(R.drawable.ic_search);
            binding.imghistory.setImageResource(R.drawable.ic_history);
        }
        public void Profile(View view){
            displayView(PROFILE_page);
            binding.imghome.setImageResource(R.drawable.ic_home);
            binding.imgprofile.setImageResource(R.drawable.ic_supervisor_disactive);
            binding.imgsearch.setImageResource(R.drawable.ic_search);
            binding.imghistory.setImageResource(R.drawable.ic_history);
        }
        public void AddOrder(View view){
            startActivity(new Intent(Main.this , CreateOrder.class));
        }
        public void Search(View view){
            displayView(SEARCH_page);
            binding.imghome.setImageResource(R.drawable.ic_home);
            binding.imgprofile.setImageResource(R.drawable.ic_supervisor);
            binding.imgsearch.setImageResource(R.drawable.ic_search_disactive);
            binding.imghistory.setImageResource(R.drawable.ic_history);
        }
        public void History(View view){
            displayView(HISTORY_PAGE);
            binding.imghome.setImageResource(R.drawable.ic_home);
            binding.imgprofile.setImageResource(R.drawable.ic_supervisor);
            binding.imgsearch.setImageResource(R.drawable.ic_search);
            binding.imghistory.setImageResource(R.drawable.ic_history_disactive);
        }

       
    }
    
}
