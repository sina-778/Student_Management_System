package sina.student.studentmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sina.student.studentmanagement.model.Student;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {

    Optional<Student> findStudentById(Long id);

}
