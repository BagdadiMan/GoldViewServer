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

    public List<Patient> getPatientsByRoomId(Integer roomId){
        return this.patientsRepository.findByRoom_Id(roomId);
    }
}
