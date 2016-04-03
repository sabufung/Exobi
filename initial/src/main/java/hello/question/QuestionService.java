package hello.question;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface QuestionService {
	public QuestionEntity getQuestionById(int id);

	public QuestionEntity insertQuestion(QuestionEntity question);

	public QuestionEntity updateQuestion(QuestionEntity question);

	public QuestionEntity deleteQuestion(QuestionEntity question);

	public List<QuestionEntity> getQuestionByExamId(int id);
}