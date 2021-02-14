package spring.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.data.repository.AlbumRepository;
import spring.jpa.entities.Album;
import spring.jpa.entities.Singer;

import java.util.List;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository repository;

    @Autowired
    public AlbumServiceImpl(AlbumRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Album> findBySinger(Singer singer) {
        return repository.findBySinger(singer);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Album> findByTitle(String title) {
        return repository.findByTitle(title);
    }
}
