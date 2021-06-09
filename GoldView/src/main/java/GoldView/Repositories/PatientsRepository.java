package GoldView.Repositories;

import GoldView.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientsRepository extends JpaRepository<Patient, String> {

    List<Patient> findByRoom_Id(Integer id);
    List<Patient> findByReleaseDateIsNull();
}
