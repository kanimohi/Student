package guru.springframework.controllers;

import guru.springframework.domain.Student;
import guru.springframework.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public Optional<Student> getStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public ResponseEntity<Object> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
    public Object updateStudent(@RequestBody Student student, @PathVariable Integer id) {
        studentService.updateStudent(id, student);
        return "Updated Successfully";
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public Object deleteStudent(@PathVariable Integer id) {

        studentService.deleteStudent(id);
        return "Deleted Successfully";
    }
}






