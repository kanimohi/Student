package guru.springframework.controllers;

import guru.springframework.domain.Course;
import guru.springframework.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @RequestMapping(value = "/courses/{id}", method = RequestMethod.GET)
    public Optional<Course> getCourse(@PathVariable Integer id){
        return courseService.getCourses(id);
    }

    @RequestMapping(value = "/courses", method = RequestMethod.POST)
    public ResponseEntity<Object> addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/courses/{id}", method = RequestMethod.PUT)
    public Object updateCourse(@RequestBody Course course, @PathVariable Integer id) {
        courseService.updateCourse(id, course);
        return "Updated Successfully";
    }

    @RequestMapping(value = "/courses/{id}", method = RequestMethod.DELETE)
    public Object deleteCourse(@PathVariable Integer id) {

        courseService.deleteCourse(id);
        return "Deleted Successfully";
    }
}


