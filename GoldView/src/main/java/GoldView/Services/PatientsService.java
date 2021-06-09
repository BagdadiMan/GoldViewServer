package GoldView.Services;

import GoldView.Repositories.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientsService {

    @Autowired
    private PatientsRepository patientsRepository;
}
