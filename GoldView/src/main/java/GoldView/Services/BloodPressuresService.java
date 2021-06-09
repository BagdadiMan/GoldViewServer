package GoldView.Services;

import GoldView.Models.BloodPressure;
import GoldView.Repositories.BloodPressuresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloodPressuresService {

    @Autowired
    BloodPressuresRepository bloodPressuresRepository;

    public void addBloodPressureCheck(BloodPressure newBloodPressure){
        this.bloodPressuresRepository.save(newBloodPressure);
    }
}
