package GoldView.Services;

import GoldView.Models.Hospital;
import GoldView.Repositories.HospitalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HospitalsService {

    @Autowired
    private HospitalsRepository hospitalsRepository;

    public List<Hospital> getAllHospitals() {
        return hospitalsRepository.findAll();
    }
}
