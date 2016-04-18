package hello.exam;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ExamRepository extends JpaRepository<ExamEntity, Long> {
	public List<ExamEntity> findAllByOrderByTestDone();

	public List<ExamEntity> findBySubject(String subject);
	
}