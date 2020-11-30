package TextookApplication.Controller;


import TextookApplication.entity.StudClass;
import TextookApplication.service.StudClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class StudClassController {

    @Autowired
    private StudClassService service;

    @PostMapping
    public List<StudClass> create(List<StudClass> studClasses){
        return service.saveStudClass(studClasses);
    }
    @GetMapping
    public List<StudClass> findAllStudClasses(){
        return service.getStudClasses();
    }
    @PostMapping
    public StudClass update(StudClass studClass){
        return service.updateStudClass(studClass);
    }
    @DeleteMapping
    public String deleteStudClass(int id){
        return service.deleteStudClass(id);
    }
}

