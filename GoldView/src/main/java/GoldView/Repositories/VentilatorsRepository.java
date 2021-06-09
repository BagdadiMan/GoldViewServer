package GoldView.Repositories;

import GoldView.Models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentilatorsRepository extends JpaRepository<Hospital, Integer> {
}
