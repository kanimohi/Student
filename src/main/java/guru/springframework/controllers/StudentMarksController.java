package guru.springframework.controllers;

import guru.springframework.domain.Staff;
import guru.springframework.domain.StudentMarks;
import guru.springframework.services.StaffService;
import guru.springframework.services.StudentsMarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentMarksController {

    @Autowired
    private StudentsMarksService studentsMarksService;

    @RequestMapping("/marks")
    public List<StudentMarks> getAllStudentMarks() {
        return studentsMarksService.getAllStudentsMarks();
    }

    @RequestMapping(value = "/marks/{id}", method = RequestMethod.GET)
    public Optional<StudentMarks> getStudentMarks(@PathVariable Integer id){
        return studentsMarksService.getStudentMarks(id);
    }

    @RequestMapping(value = "/marks", method = RequestMethod.POST)
    public ResponseEntity<Object> addStudentMarks(@RequestBody StudentMarks studentMarks) {
        studentsMarksService.addStudentMarks(studentMarks);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/marks/{id}", method = RequestMethod.PUT)
    public Object updateStaff(@RequestBody StudentMarks studentMarks, @PathVariable Integer id) {
        studentsMarksService.updateStudentMarks(id, studentMarks);
        return "Updated Successfully";
    }

    @RequestMapping(value = "/marks/{id}", method = RequestMethod.DELETE)
    public Object deleteStudentMarks(@PathVariable Integer id) {

        studentsMarksService.deleteStudentMarks(id);
        return "Deleted Successfully";
    }
}


