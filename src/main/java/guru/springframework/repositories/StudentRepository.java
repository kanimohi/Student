package guru.springframework.repositories;

import guru.springframework.domain.Student;
import org.apache.catalina.mapper.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {


}
