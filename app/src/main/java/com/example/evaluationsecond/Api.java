package com.example.evaluationsecond;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET(" v1/us/daily.json")
    Call<ResponseDTO>getpost();
}
