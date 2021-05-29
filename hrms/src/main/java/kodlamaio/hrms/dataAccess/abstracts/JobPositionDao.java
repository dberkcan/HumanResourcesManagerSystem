package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
    Optional<JobPosition> findByTitle(String title);
}
