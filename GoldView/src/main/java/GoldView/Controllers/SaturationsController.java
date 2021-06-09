package GoldView.Controllers;

import GoldView.Services.SaturationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Saturations")
@CrossOrigin
public class SaturationsController {

    @Autowired
    SaturationsService saturationsService;
}
