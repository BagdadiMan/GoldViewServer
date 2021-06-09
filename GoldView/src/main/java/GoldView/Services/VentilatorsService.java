package GoldView.Services;

import GoldView.Models.Patient;
import GoldView.Models.Ventilator;
import GoldView.Repositories.VentilatorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentilatorsService {

    @Autowired
    private VentilatorsRepository ventilatorsRepository;

    public List<Ventilator> findAllFreeVentilators (){
        return this.ventilatorsRepository.findByPatientIsNull();
    }

    public Ventilator linkVentilatorToPatient(Ventilator ventilator) {
        ventilator.setDepartment(null);
        return this.ventilatorsRepository.save(ventilator);
    }
}
