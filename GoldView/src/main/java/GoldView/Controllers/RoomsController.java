package GoldView.Controllers;

import GoldView.Services.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/rooms")
public class RoomsController {

    @Autowired
    private RoomsService roomsService;
}
