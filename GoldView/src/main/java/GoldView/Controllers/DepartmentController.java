package GoldView.Controllers;

import GoldView.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
}
