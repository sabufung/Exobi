package hello.answer;

import org.springframework.stereotype.Service;

@Service
public interface AnswerService {
	public AnswerEntity getAnswerById(int id);
	public AnswerEntity getAnswerByQuestionId(int id);
}