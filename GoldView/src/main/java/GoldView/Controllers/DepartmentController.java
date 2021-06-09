package GoldView.Controllers;

import GoldView.Models.Department;
import GoldView.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@CrossOrigin
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/hospital/{id}")
    public List<Department> getAllByHospitalId(@PathVariable Integer id) {
        return departmentService.getAllByHospitalId(id);
    }

    @GetMapping("/all")
    public List<Department> getAllDepartments(){
        return this.departmentService.getAllDepartments();
    }
}
