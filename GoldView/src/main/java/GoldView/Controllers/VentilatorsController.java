package GoldView.Controllers;

import GoldView.Services.VentilatorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ventilators")
public class VentilatorsController {

    @Autowired
    private VentilatorsService ventilatorsService;
}
