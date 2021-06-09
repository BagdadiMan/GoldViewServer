package GoldView.Controllers;

import GoldView.Services.BloodPressuresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BloodPressure")
@CrossOrigin
public class BloodPressuresController {

    @Autowired
    BloodPressuresService bloodPressuresService;
}
