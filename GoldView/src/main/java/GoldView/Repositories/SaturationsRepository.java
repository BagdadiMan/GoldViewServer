package GoldView.Repositories;

import GoldView.Models.Saturation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaturationsRepository extends JpaRepository<Saturation, Integer> {
}
