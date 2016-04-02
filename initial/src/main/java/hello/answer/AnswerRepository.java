package hello.answer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<AnswerEntity, Integer>{
	public AnswerEntity findAnswerByQuestionId(int id);
}