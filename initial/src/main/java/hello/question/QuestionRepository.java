package hello.question;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {
	public QuestionEntity findQuestionByExamId(int id);
}