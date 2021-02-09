package com.example.novosti.ui.country;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.novosti.data.model.Article;
import com.example.novosti.data.model.Category;
import com.example.novosti.data.repository.CategoryRepository;
import com.example.novosti.data.repository.CountryRepository;
import com.example.novosti.data.repository.impl.CountryRepositoryImpl;

import java.util.List;

public class CountryViewModel extends ViewModel {

    private CountryRepository countryRepository = new CountryRepositoryImpl();

    public List<Article> getArticlesByCountry(String country) {
        List<Article> articles = countryRepository.getArticlesByCountry(country);
        return articles;
    }
}