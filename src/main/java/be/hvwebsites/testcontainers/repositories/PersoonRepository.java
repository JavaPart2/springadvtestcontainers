package be.hvwebsites.testcontainers.repositories;

import be.hvwebsites.testcontainers.domain.Persoon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersoonRepository extends JpaRepository<Persoon, Long> {
}
