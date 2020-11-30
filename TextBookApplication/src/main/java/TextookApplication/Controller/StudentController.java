package TextookApplication.Controller;

import TextookApplication.entity.Student;
import TextookApplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentController {

    @Autowired
    private StudentService service;

    public List<Student> create(List<Student> students){
        return service.saveStudents(students);
    }
    public List<Student> findAllStudents(){
        return service.getStudents();
    }
    public Student update(Student student){
        return service.updateStudent(student);
    }
    public String deleteStudent(int id){
        return service.deleteStudent(id);
    }
}
