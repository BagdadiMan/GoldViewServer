package GoldView.Controllers;

import GoldView.Services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/patients")
public class PatientsController {

    @Autowired
    private PatientsService patientsService;
}
