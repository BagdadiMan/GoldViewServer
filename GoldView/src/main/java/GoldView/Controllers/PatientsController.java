package GoldView.Controllers;

import GoldView.Models.Patient;
import GoldView.Services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientsController {

    @Autowired
    private PatientsService patientsService;

    @GetMapping("/room/{id}")
    public List<Patient> GetPatientsByRoomId(@PathVariable Integer id){
        return this.patientsService.getPatientsByRoomId(id);
    }

    @GetMapping("/{id}")
    public Patient GetPatientById(@PathVariable String id) {
        return this.patientsService.getPatientById(id);
    }

    @PostMapping("/realise/{id}")
    public void ReleasePatient(@PathVariable String id){
        this.patientsService.releasePatientById(id);
    }
}
