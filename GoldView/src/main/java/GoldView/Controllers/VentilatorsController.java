package GoldView.Controllers;

import GoldView.Models.Ventilator;
import GoldView.Services.VentilatorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ventilators")
public class VentilatorsController {

    @Autowired
    private VentilatorsService ventilatorsService;

    @GetMapping("/free")
    public List<Ventilator> GetAllFreeVentilators(){
        return this.ventilatorsService.findAllFreeVentilators();
    }
}
