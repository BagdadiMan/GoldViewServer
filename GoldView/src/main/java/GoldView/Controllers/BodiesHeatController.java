package GoldView.Controllers;

import GoldView.Services.BodiesHeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BodiesHeat")
@CrossOrigin
public class BodiesHeatController {

    @Autowired
    BodiesHeatService bodiesHeatService;
}
