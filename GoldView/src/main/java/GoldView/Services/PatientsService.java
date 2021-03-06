package GoldView.Services;

import GoldView.Models.Patient;
import GoldView.Repositories.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientsService {

    @Autowired
    private PatientsRepository patientsRepository;

    public List<Patient> getPatientsByRoomId(Integer roomId) {
        return this.patientsRepository.findByRoom_Id(roomId);
    }

    public Patient getPatientById(String id) {
        return this.patientsRepository.findById(id).get();
    }

    public Patient releasePatientById(String patientId) {
        Patient patient = this.patientsRepository.findById(patientId).get();
        patient.setDateToday();
        return this.patientsRepository.save(patient);
    }

    public List<Patient> findPatientInHospitalization() {
        return this.patientsRepository.findByReleaseDateIsNull();
    }

    public Patient addPatient(Patient patient) {
        return this.patientsRepository.save(patient);
    }

//    public Integer numOfPetientByDepart(Integer id){
//        return this.patientsRepository.countByDepartment_Id(id);
//    }

    public Integer numOfPetientByRoom(Integer id){
        return this.patientsRepository.countByRoom_Id(id);
    }
}
