package GoldView.Repositories;

import GoldView.Models.BodyHeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodiesHeatRepository extends JpaRepository<BodyHeat, Integer> {
}
