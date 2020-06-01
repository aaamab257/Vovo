package com.aaamab.delivery.vovo.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aaamab.delivery.vovo.R;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyView> {
    String [] orders = {"أنف وأذن","أسنان","عظام","عيون","مخ وأعصاب","نفسى"};
    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.orders_item, parent, false);

        return new MyView(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, int position) {
        holder.orderDis.setText(orders[position]);
    }

    @Override
    public int getItemCount() {
        return orders.length;
    }

    public class MyView extends RecyclerView.ViewHolder {
        TextView orderDis ;
        public MyView(@NonNull View itemView) {
            super(itemView);
            orderDis = itemView.findViewById(R.id.order_dis);
        }
    }
}
