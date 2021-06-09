package GoldView.Controllers;

import GoldView.Models.Patient;
import GoldView.Services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
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
    public void ReleasePatient(@PathVariable String id) {
        this.patientsService.releasePatientById(id);
    }

    @GetMapping("/hospitalization")
    public List<Patient> findPatientInHospitalization () {
        return this.patientsService.findPatientInHospitalization();
    }

    @PostMapping("")
    public Patient addNewPatient (@RequestBody Patient patient) {
        return this.patientsService.addPatient(patient);
    }
}
