package TextookApplication.service;

import TextookApplication.entity.Subject;
import TextookApplication.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository repository;

    public List<Subject> saveSubjects(List<Subject> subjects){
        return repository.saveAll(subjects);
    }
    public List<Subject> getSubjects(){
        return repository.findAll();
    }
    public String deleteSubject(int id){
        repository.deleteById(id);
        return "Subject deleted "+ id;
    }
    public Subject updateSubject(Subject subject){
        return this.repository.save(subject);
    }
}
