package TextookApplication.service;

import TextookApplication.entity.Course;
import TextookApplication.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public List<Course> saveCourse(List<Course> courses){
        return repository.saveAll(courses);
    }

    public List<Course> getCourses(){
        return repository.findAll();
    }
    public String deleteCourse(int courseCode){
        repository.deleteById(courseCode);
        return "Course deleted"+courseCode;
    }
    public Course updateCourse(Course course){
        return this.repository.save(course);
    }
}
