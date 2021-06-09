package GoldView.Repositories;

import GoldView.Models.BloodPressure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodPressuresRepository  extends JpaRepository<BloodPressure, Integer> {

}
