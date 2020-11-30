package TextookApplication.Controller;

import TextookApplication.entity.Subject;
import TextookApplication.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class SubjectController {

    @Autowired
    private SubjectService service;

    @PostMapping
    public List<Subject> create(List<Subject> subjects){
        return service.saveSubjects(subjects);
    }
    @GetMapping
    public List<Subject> findAllSubjects(){
        return service.getSubjects();
    }
    @PostMapping
    public Subject update(Subject subject){
        return service.updateSubject(subject);
    }
    @DeleteMapping
    public String deleteSubject(int id){
        return service.deleteSubject(id);
    }
}
