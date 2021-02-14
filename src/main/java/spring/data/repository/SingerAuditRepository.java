package spring.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.data.entity.SingerAudit;

@Repository
public interface SingerAuditRepository extends JpaRepository<SingerAudit, Long> {
}
