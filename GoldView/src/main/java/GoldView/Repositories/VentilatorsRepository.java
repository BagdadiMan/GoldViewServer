package GoldView.Repositories;

import GoldView.Models.Ventilator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentilatorsRepository extends JpaRepository<Ventilator, String> {

    List<Ventilator> findByPatientIsNull();
}
