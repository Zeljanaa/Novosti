package com.example.novosti.data.repository;

import com.example.novosti.data.model.Category;
import com.example.novosti.data.service.BaseApiService;
import com.example.novosti.data.service.CategoryService;
import com.example.novosti.data.service.CountryService;

import java.util.List;

public class CategoryRepository {

    private CategoryService categoryService = BaseApiService.getCategoryService();
    private CountryService countryService = BaseApiService.getCountryService();

    public List<Category> getAllByCategory() {
        return this.categoryService.getAllByCategory();
    }
}
