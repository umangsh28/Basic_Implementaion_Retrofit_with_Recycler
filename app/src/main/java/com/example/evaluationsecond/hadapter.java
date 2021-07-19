package com.example.evaluationsecond;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class hadapter extends RecyclerView.Adapter<ViewHolder> {
    private List<ResponseDTO> rsplist;

    public hadapter(List<ResponseDTO> rsplist) {
        this.rsplist = rsplist;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdesign,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ViewHolder holder, int position) {
        ResponseDTO responseDTO=rsplist.get(position);
        holder.setData(responseDTO);
    }

    @Override
    public int getItemCount() {
        return rsplist.size();
    }
}
