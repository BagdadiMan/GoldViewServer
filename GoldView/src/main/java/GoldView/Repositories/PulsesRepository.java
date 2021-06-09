package GoldView.Repositories;

import GoldView.Models.Pulse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PulsesRepository extends JpaRepository<Pulse, Integer> {
}
