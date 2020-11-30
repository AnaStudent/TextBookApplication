package TextookApplication.Controller;


import TextookApplication.entity.Course;
import TextookApplication.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping
    public List<Course> create(List<Course> courses) {
        return service.saveCourse(courses);
    }
    @GetMapping
    public List<Course> findAllCourse(){
        return service.getCourses();
    }
    @PostMapping
    public Course update(@RequestBody Course course){
        return service.updateCourse(course);
    }
    @DeleteMapping
    public String deleteCourse(@PathVariable int id){
        return service.deleteCourse(id);
    }

}
