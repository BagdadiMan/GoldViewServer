package GoldView.Controllers;

import GoldView.Services.PulsesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Pulses")
public class PulsesController {

    @Autowired
    PulsesService pulsesService;
}
