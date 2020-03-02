package guru.springframework.repositories;

import guru.springframework.domain.StudentMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsMarksRepository extends JpaRepository<StudentMarks,Integer> {
}
