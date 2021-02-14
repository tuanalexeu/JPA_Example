package spring.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.data.repository.SingerRepository;
import spring.jpa.entities.Singer;

import java.util.List;

@Service("springJpaDataService")
@Transactional
public class SingerServiceImpl implements SingerService {

    private final SingerRepository repository;

    @Autowired
    public SingerServiceImpl(SingerRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Singer> findAll() {
        return (List<Singer>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Singer> findByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Singer> findByFirstNameAndLastName(String firstName, String lastName) {
        return repository.findByFirstNameAndLastName(firstName, lastName);
    }
}
