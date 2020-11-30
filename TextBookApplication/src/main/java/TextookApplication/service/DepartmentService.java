package TextookApplication.service;

import TextookApplication.entity.Department;
import TextookApplication.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public List<Department> saveDepartment(List<Department> departments){

        return repository.saveAll(departments);
    }
    public List<Department> getDepartment(){
        return repository.findAll();
    }
    public String deleteDepartment(int id){
        repository.deleteById(id);
        return "delete department" +id;
    }
    public Department updateDepartment(Department department){
        return this.repository.save(department);
    }
}
