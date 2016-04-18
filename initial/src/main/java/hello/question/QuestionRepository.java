package hello.question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {
	public List<QuestionEntity> findQuestionByExamIdAndIsActiveTrue(int id);
}