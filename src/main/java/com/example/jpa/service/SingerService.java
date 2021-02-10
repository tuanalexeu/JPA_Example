package com.example.jpa.service;

import com.example.jpa.entities.Singer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SingerService {
    @Transactional(readOnly = true)
    List<Singer> findByCriteriaQuery(String firstName, String lastName);

    List<Singer> findAll();
    List<Singer> findAllWithAlbum();
    Singer findById(Long id);
    Singer save(Singer singer);
    void delete(Singer singer);
    List<Singer> findAllByNativeQuery();
}
