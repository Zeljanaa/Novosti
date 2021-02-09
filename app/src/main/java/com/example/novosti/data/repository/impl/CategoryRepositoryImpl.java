package com.example.novosti.data.repository.impl;

import com.example.novosti.data.model.Category;
import com.example.novosti.data.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl extends CategoryRepository {

    //ovde bi trebalo nesto sto dobavlja podatke pretpostavljam ali ne znam kako da dobavim sa tog apija

    //Zamislila sam da je ovo instanca nekog apija!!!
    static List<Category> allCategories() {
        List<Category> categories= new ArrayList();
        Category c1= new Category();
        c1.setAuthor("Informer");
        c1.setTitle("Business");
        c1.setDescription("Some description");
        categories.add(c1);

        Category c2= new Category();
        c2.setAuthor("Kurir");
        c2.setTitle("Entertainment");
        c2.setDescription("Some description");

        categories.add(c2);

        Category c3 = new Category();
        c3.setAuthor("Kurir");
        c3.setTitle("Health");
        c3.setDescription("Some description");

        categories.add(c3);

        Category c4 = new Category();
        c4.setAuthor("Kurir");
        c4.setTitle("Science");
        c4.setDescription("Some description");

        categories.add(c4);

        Category c5 = new Category();
        c5.setAuthor("Null");
        c5.setTitle("Sports");
        c5.setDescription("Some description");

        categories.add(c5);

        Category c6 = new Category();
        c6.setAuthor("Null");
        c6.setTitle("Technology");
        c6.setDescription("Some description");

        categories.add(c6);

        return allCategories();
    }


    public List<Category> findAll() {
        return allCategories();
    }
}
