package com.example.rm31308.timemachine.api;

import com.example.rm31308.timemachine.model.Carro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by rm31308 on 19/11/2016.
 */
public interface CarroAPI {

    @GET("/carros/tipo/{tipo}")
    Call<List<Carro>> findBy(@Path("tipo") String tipo);

}
