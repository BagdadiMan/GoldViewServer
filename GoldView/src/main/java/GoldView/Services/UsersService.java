package GoldView.Services;

import GoldView.Models.User;
import GoldView.Repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public List<User> getAllAirport() {
        return usersRepository.findAll();
    }
}
