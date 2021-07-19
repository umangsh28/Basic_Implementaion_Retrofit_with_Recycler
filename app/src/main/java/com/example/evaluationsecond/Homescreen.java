package com.example.evaluationsecond;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Homescreen extends AppCompatActivity {
    private EditText mtxt1;
    private Button mbtn3;
    private RecyclerView recyclerView;
    private List<ResponseDTO> responseDTOS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        recyclerView=findViewById(R.id.rec);
        mtxt1=findViewById(R.id.yu);
        setRecycle();
        Apical();
    }


    private void setRecycle() {
        com.example.evaluationsecond.hadapter hadapter = new hadapter(responseDTOS);
         recyclerView=findViewById(R.id.rec);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(hadapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public void Apical(){

     Api apiservice=Network.getInstance().create(Api.class);
        apiservice.getpost().enqueue(new Callback<ResponseDTO>() {
            @Override
            public void onResponse(Call<ResponseDTO> call, Response<ResponseDTO> response) {
                if(response.body()!=null){
                    responseDTOS=response.body();
                }else{
                    mtxt1.setError("null data");
                }


            }

            @Override
            public void onFailure(Call<ResponseDTO> call, Throwable t) {

            }
        });
    }



}