package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.ActivationCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ActivationCodeDao extends JpaRepository<ActivationCode,Integer> {
    Optional<ActivationCode> findByUserUid(String uid);
}
