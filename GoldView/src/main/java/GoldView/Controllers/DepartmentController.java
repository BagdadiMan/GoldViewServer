package GoldView.Controllers;

import GoldView.Models.Department;
import GoldView.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/hospital/{id}")
    public List<Department> getAllByHospitalId(@PathVariable Integer id) {
        return departmentService.getAllByHospitalId(id);
    }
}
