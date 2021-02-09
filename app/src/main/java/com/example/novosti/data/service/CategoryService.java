package com.example.novosti.data.service;

import com.example.novosti.data.model.Category;

import java.util.List;

import retrofit2.http.GET;


public interface CategoryService {
//ovo treba sada da dobavim apije
    @GET("v2/top-headlines")


    public List<Category> getAllByCategory();




}
