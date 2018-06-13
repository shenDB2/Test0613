package com.example.cjcu.test0531;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by CJCU on 2018/6/13.
 */

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder>{
    private List<Perpon> trans;
    public TransactionAdapter(List<Perpon> trans) {
        this.trans = trans;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Perpon perpon = trans.get(position);
        holder.item_cdate.setText(perpon.getCdate());
        holder.item_amount.setText(perpon.getAmount());
        holder.item_info.setText(perpon.getAmount());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView item_cdate;
        private final TextView item_info;
        private final TextView item_amount;

        public ViewHolder(View itemView) {
            super(itemView);

            item_cdate = itemView.findViewById(R.id.tv_cdate);
            item_info = itemView.findViewById(R.id.tv_info);
            item_amount = itemView.findViewById(R.id.tv_amount);
        }
    }
}
