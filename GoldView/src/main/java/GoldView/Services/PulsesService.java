package GoldView.Services;

import GoldView.Repositories.PulsesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PulsesService {

    @Autowired
    PulsesRepository pulsesRepository;
}
