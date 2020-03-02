package guru.springframework.services;

import guru.springframework.domain.Student;
import guru.springframework.domain.StudentMarks;
import guru.springframework.repositories.StudentRepository;
import guru.springframework.repositories.StudentsMarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentsMarksService {
    @Autowired
    StudentsMarksRepository studentsMarksRepository;

    public List<StudentMarks> getAllStudentsMarks() {
        List<StudentMarks> studentMarks = new ArrayList<>();
        studentsMarksRepository.findAll().forEach(studentMarks::add);
        return studentMarks;
    }

    public Optional<StudentMarks> getStudentMarks(Integer id) {
        return studentsMarksRepository.findById(id);
    }

    public void addStudentMarks(StudentMarks studentMarks) {
        studentsMarksRepository.save(studentMarks);
    }

    public void updateStudentMarks(Integer id, StudentMarks studentMarks) {
        studentsMarksRepository.save(studentMarks);
    }

    public void deleteStudentMarks(Integer id) {
        studentsMarksRepository.deleteById(id);
    }
}


