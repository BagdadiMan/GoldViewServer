package GoldView.Controllers;

import GoldView.Models.Ventilator;
import GoldView.Services.VentilatorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventilators")
public class VentilatorsController {

    @Autowired
    private VentilatorsService ventilatorsService;

    @GetMapping("/free")
    public List<Ventilator> GetAllFreeVentilators() {
        return this.ventilatorsService.findAllFreeVentilators();
    }

    @PatchMapping("")
    public Ventilator linkVentilatorToPatient(@RequestBody Ventilator ventilator) {
        return this.ventilatorsService.linkVentilatorToPatient(ventilator);
    }

    @PatchMapping("/freePatient")
    public Ventilator freeVentilatorFromPatient(@RequestBody Ventilator ventilator) {
        return this.ventilatorsService.freeVentilatorFromPatient(ventilator);
    }
}
