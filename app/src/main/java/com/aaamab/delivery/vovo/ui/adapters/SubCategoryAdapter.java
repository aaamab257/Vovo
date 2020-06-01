package com.aaamab.delivery.vovo.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aaamab.delivery.vovo.R;
import com.aaamab.delivery.vovo.databinding.MicItemBinding;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.MyView> {
    MicItemBinding binding ;
    String [] name = {"Ahmed","Khaled","Yousef","Mohamed","Ibrahim","Magdy","Fares","Abdo","Fathy"};
    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mic_item, parent, false);

        return new MyView(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, int position) {
        holder.nametxt.setText(name[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class MyView extends RecyclerView.ViewHolder {
        TextView nametxt ;
        public MyView(@NonNull View itemView) {
            super(itemView);
            nametxt = itemView.findViewById(R.id.txt_mic_name);
        }
    }
}
