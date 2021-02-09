package com.example.novosti.data.repository;

import com.example.novosti.data.model.Article;
import com.example.novosti.data.model.Country;

import java.util.List;

public interface CountryRepository extends BaseRepository<Country> {
    List<Article>getArticlesByCountry(String country);
}
