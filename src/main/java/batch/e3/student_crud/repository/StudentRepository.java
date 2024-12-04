package batch.e3.student_crud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import batch.e3.student_crud.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	boolean existsByMobile(long mobile);

	List<Student> findByName(String name);

	Optional<Student> findByMobile(long mobile);

	List<Student> findByPercentageGreaterThanEqualAndPercentageLessThan(int i,int j);

}
