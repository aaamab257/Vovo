package com.aaamab.delivery.vovo.ui.home;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aaamab.delivery.vovo.R;
import com.aaamab.delivery.vovo.databinding.FragmentHomeBinding;
import com.aaamab.delivery.vovo.ui.adapters.SubCategoryAdapter;
import com.aaamab.delivery.vovo.ui.adapters.CategoryAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    FragmentHomeBinding binding ;
    View v ;
    SubCategoryAdapter adapter;
    CategoryAdapter categoryAdapter;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        v = binding.getRoot();
        adapter = new SubCategoryAdapter();
        categoryAdapter = new CategoryAdapter();
        binding.recHelps.setLayoutManager(new GridLayoutManager(getContext() , 2 , LinearLayoutManager.VERTICAL , false));
        binding.recHelps.setAdapter(categoryAdapter);
        binding.recMandobeen.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
        binding.recMandobeen.setAdapter(adapter);
        return v ;

    }
}
