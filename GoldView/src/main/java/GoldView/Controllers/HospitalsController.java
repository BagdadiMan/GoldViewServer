package GoldView.Controllers;

import GoldView.Models.Hospital;
import GoldView.Services.HospitalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
@CrossOrigin
public class HospitalsController {
    @Autowired
    private HospitalsService hospitalsService;

    @GetMapping("")
    public List<Hospital> getAllHospitals() {
        return hospitalsService.getAllHospitals();
    }

    @GetMapping("/{id}")
    public Hospital getById(@PathVariable Integer id) {
        return hospitalsService.getById(id).get();
    }
}
