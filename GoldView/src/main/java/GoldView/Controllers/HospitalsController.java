package GoldView.Controllers;

import GoldView.Models.Hospital;
import GoldView.Services.HospitalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
public class HospitalsController {
    @Autowired
    HospitalsService hospitalsService;

    @GetMapping("")
    public List<Hospital> getAllHospitals() {
        return hospitalsService.getAllHospitals();
    }
}
