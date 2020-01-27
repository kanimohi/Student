package guru.springframework.repositories;

import guru.springframework.domain.Fees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeesRepository extends JpaRepository<Fees,Integer> {
}
