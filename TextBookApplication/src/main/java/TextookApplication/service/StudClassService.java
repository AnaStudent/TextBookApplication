package TextookApplication.service;

import TextookApplication.entity.StudClass;
import TextookApplication.repository.StudClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudClassService {

    @Autowired
    private StudClassRepository repository;

    public List<StudClass> saveStudClass(List<StudClass> studClasses){
        return repository.saveAll(studClasses);
    }
    public List<StudClass> getStudClasses(){
        return repository.findAll();
    }
    public String deleteStudClass(int id){
        repository.deleteById(id);
        return "StudClass deleted" +id;
    }
    public StudClass updateStudClass(StudClass studClass){
        return this.repository.save(studClass);
    }
}
