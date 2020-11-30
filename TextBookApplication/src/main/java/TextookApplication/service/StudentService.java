package TextookApplication.service;

import TextookApplication.entity.Student;
import TextookApplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }
    public List<Student> getStudents(){
        return repository.findAll();
    }
    public String deleteStudent(int id){
        repository.deleteById(id);
        return "Student deleted" +id;
    }
    public Student updateStudent(Student student){
        return this.repository.save(student);
    }
}
