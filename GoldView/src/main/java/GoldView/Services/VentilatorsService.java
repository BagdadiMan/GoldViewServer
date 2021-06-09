package GoldView.Services;

import GoldView.Models.Ventilator;
import GoldView.Repositories.PatientsRepository;
import GoldView.Repositories.VentilatorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentilatorsService {

    @Autowired
    private VentilatorsRepository ventilatorsRepository;
    @Autowired
    private PatientsRepository patientsRepository;

    public List<Ventilator> findAllFreeVentilators() {
        return this.ventilatorsRepository.findByPatientIsNull();
    }

    public Ventilator linkVentilatorToPatient(Ventilator ventilator) {
        ventilator.setDepartment(null);
        return this.ventilatorsRepository.save(ventilator);
    }

    public Ventilator freeVentilatorFromPatient(Ventilator ventilator) {
        ventilator.setDepartment(patientsRepository.findById(ventilator.getPatient().getId()).get().getRoom().getDepartment());
        ventilator.setPatient(null);
        return this.ventilatorsRepository.save(ventilator);
    }

    public int GetFreeCountByDepartment(int id) {
        return this.ventilatorsRepository.countByPatientIsNull();
    }
}
