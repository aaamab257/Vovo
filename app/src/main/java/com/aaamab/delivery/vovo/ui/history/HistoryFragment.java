package com.aaamab.delivery.vovo.ui.history;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aaamab.delivery.vovo.R;
import com.aaamab.delivery.vovo.databinding.FragmentHistoryBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {
    FragmentHistoryBinding binding;
    View v ;
    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_history, container, false);
        v = binding.getRoot();
        return v ;
    }
}
