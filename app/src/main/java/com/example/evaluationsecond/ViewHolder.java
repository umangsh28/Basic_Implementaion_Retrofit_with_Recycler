package com.example.evaluationsecond;

import android.content.ClipData;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder  extends RecyclerView.ViewHolder {
    private TextView  date;
    private TextView  positive;
    private TextView  negative;
    private TextView  hospitalise;
    private TextView  death;
    private TextView  datacheck;

    public ViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        date=itemView.findViewById(R.id.datecheck);
        positive=itemView.findViewById(R.id.positive);
        negative=itemView.findViewById(R.id.negative);
        hospitalise=itemView.findViewById(R.id.hosp);
        death=itemView.findViewById(R.id.death);
        datacheck=itemView.findViewById(R.id.datecheck);
    }

    public void setData(ResponseDTO responseDTO){
        date.setText(responseDTO.getDate());
        positive.setText(responseDTO.getDate());
        negative.setText(responseDTO.getDate());
        hospitalise.setText(responseDTO.getDate());
        death.setText(responseDTO.getDate());
        datacheck.setText(responseDTO.getDate());
    }


}
