package spring.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.data.entity.SingerAudit;
import spring.data.repository.SingerAuditRepository;

import java.util.List;

@Service
@Transactional
public class SingerAuditImpl implements SingerAuditService {

    private final SingerAuditRepository repository;

    @Autowired
    public SingerAuditImpl(SingerAuditRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<SingerAudit> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public SingerAudit findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    @Transactional
    public SingerAudit save(SingerAudit singer) {
        return repository.save(singer);
    }
}
