package GoldView.Controllers;

import GoldView.Models.User;
import GoldView.Services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UsersService usersService;

    @GetMapping("")
    public List<User> getAllUsers() {
        return usersService.getAllAirport();
    }
}
