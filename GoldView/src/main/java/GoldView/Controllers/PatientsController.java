package GoldView.Controllers;

import GoldView.Models.Patient;
import GoldView.Services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
