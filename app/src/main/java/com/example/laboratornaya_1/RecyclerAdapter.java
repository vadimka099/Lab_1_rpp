package com.example.laboratornaya_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    LayoutInflater inflater;


    public class ViewHolder extends RecyclerView.ViewHolder {

        final TextView number;
        final TextView text;
        final LinearLayout layout;
        final ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.layout);

            number = itemView.findViewById(R.id.number);
            text = itemView.findViewById(R.id.text);

            imageView = itemView.findViewById(R.id.img);
        }
    }

    public RecyclerAdapter(Context context) {

        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        holder.text.setText(Numbers.thousands(position+1));
        holder.number.setText(Integer.toString(position+1));
        if((position+1) %2 == 0)
            holder.layout.setBackgroundColor(0xCCCCCCCC);
        else
            holder.layout.setBackgroundColor(0xFFFFFFFF);
    }

    @Override
    public int getItemCount() {
        return 1000000;
    }
}