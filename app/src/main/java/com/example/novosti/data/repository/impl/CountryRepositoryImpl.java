package com.example.novosti.data.repository.impl;

import com.example.novosti.data.model.Article;
import com.example.novosti.data.model.Category;
import com.example.novosti.data.model.Country;
import com.example.novosti.data.repository.CountryRepository;
import com.example.novosti.data.service.BaseApiService;
import com.example.novosti.data.service.CountryService;
import com.example.novosti.util.AsyncHandler;
import com.example.novosti.util.Config;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class CountryRepositoryImpl implements CountryRepository {

    private CountryService countryService = BaseApiService.getCountryService();
    private static String apiKey = Config.API_KEY;

    @Override
    public List<Article> getArticlesByCountry(String country) {
//        AsyncHandler.getHandler().post(() -> {
//            try {
//                Response<List<Article>> response = countryService.getAllByCountry(country, apiKey).execute();
//
//            } catch (Exception e) {
//
//                return null;
//            }
//        });
        return null;
    }

    @Override
    public List<Country> findAll() {
        return null;
    }
}


//            if (response.isSuccessful()) {
//                    return response.body();
//                    } else {
//                    System.out.println("request unsucessfull");
//                    System.out.println(response.code());
//                    String error = BaseApiService.parseError(response);
//                    System.out.println("error message " + error);
//                    return null;
//                    }