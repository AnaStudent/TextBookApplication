package TextookApplication.Controller;

import TextookApplication.entity.Department;
import TextookApplication.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping
    public List<Department> create(List<Department> departments){
        return service.saveDepartment(departments);
    }
    @GetMapping
    public List<Department> findAllDepartments(){
        return service.getDepartment();
    }
    @PostMapping
    public Department update(Department department){
        return  service.updateDepartment(department);
    }
    @DeleteMapping
    public String deleteDepartment(int id){
        return service.deleteDepartment(id);
    }
}
