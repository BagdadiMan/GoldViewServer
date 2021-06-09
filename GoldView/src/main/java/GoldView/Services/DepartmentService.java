package GoldView.Services;

import GoldView.Models.Department;
import GoldView.Repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllByHospitalId(Integer id) {
        return departmentRepository.findByHospital_Id(id);
    }

    public List<Department> getAllDepartments(){return this.departmentRepository.findAll();}
}
