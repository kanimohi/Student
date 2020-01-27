package guru.springframework.services;

import guru.springframework.domain.Course;
import guru.springframework.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourses(Integer id) {
        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
       courseRepository.save(course);
    }

    public void updateCourse(Integer id, Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(Integer id) {
        courseRepository.deleteById(id);
    }
}


