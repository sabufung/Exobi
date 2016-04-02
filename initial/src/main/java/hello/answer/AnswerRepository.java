package hello.answer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<AnswerEntity, Integer>{
	public List<AnswerEntity> findAnswerByQuestionId(int id);
}