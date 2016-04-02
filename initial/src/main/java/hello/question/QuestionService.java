package hello.question;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface QuestionService {
	public QuestionEntity getQuestionById(int id);

	public List<QuestionEntity> getQuestionByExamId(int id);
}