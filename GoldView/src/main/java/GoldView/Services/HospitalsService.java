package GoldView.Services;

import GoldView.Models.Hospital;
import GoldView.Repositories.HospitalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HospitalsService {

    @Autowired
    private HospitalsRepository hospitalsRepository;

    public List<Hospital> getAllHospitals() {
        return hospitalsRepository.findAll();
    }

    public Optional<Hospital> getById(Integer id) {
        return hospitalsRepository.findById(id);
    }
}
