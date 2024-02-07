package com.example.infra_hiber.repository;

import com.example.infra_hiber.entity.BookEntity;

import java.util.List;

public class BookEntityRepository extends BaseEntityRepository<BookEntity> {
    @Override
    BookEntity findById(Long id) {
        return null;
    }

    @Override
    List<BookEntity> findAll() {
        return null;
    }
}
