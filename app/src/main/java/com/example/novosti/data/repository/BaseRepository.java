package com.example.novosti.data.repository;

import java.util.List;

public interface BaseRepository<T> {
    List<T> findAll();
}
