package GoldView.Controllers;

import GoldView.Models.Patient;
import GoldView.Services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/patients")
public class PatientsController {

    @Autowired
    private PatientsService patientsService;

    @GetMapping("/room/{id}")
    public List<Patient> GetPatientsByRoomId(@PathVariable Integer id) {
        return this.patientsService.getPatientsByRoomId(id);
    }

    @GetMapping("/{id}")
    public Patient GetPatientById(@PathVariable String id) {
        return this.patientsService.getPatientById(id);
    }

    @PostMapping("/release/{id}")
    public void ReleasePatient(@PathVariable String id) {
        this.patientsService.releasePatientById(id);
    }

    @GetMapping("/hospitalization")
    public List<Patient> findPatientInHospitalization() {
        return this.patientsService.findPatientInHospitalization();
    }

    @PostMapping("")
    public Patient addNewPatient(@RequestBody Patient patient) {
        return this.patientsService.addPatient(patient);
    }

    @GetMapping("/count/department/{id}")
    public Integer numOfPetientByDepart(@PathVariable Integer id){
        return this.patientsService.numOfPetientByDepart(id);
    }

    @GetMapping("/count/room/{id}")
    public Integer numOfPetientByRoom(@PathVariable Integer id){
        return this.patientsService.numOfPetientByRoom(id);
    }
}
