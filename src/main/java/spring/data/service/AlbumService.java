package spring.data.service;

import org.springframework.stereotype.Service;
import spring.jpa.entities.Album;
import spring.jpa.entities.Singer;

import java.util.List;

public interface AlbumService {
    List<Album> findBySinger(Singer singer);
    List<Album> findByTitle(String title);
}
