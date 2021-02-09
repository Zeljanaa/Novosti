package com.example.novosti.data.service;

import com.example.novosti.data.model.Article;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CountryService {

    @GET("v2/top-headlines")
    public Call<List<Article>> getAllByCountry(@Query("country") String country, @Query("apiKey") String apiKey);

}