package GoldView.Services;

import GoldView.Repositories.RoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomsService {

    @Autowired
    private RoomsRepository roomsRepository;
}
