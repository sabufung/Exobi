package hello.answer;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface AnswerService {
	public AnswerEntity getAnswerById(int id);

	public AnswerEntity insertAnswer(AnswerEntity answer);

	public AnswerEntity updateAnswer(AnswerEntity answer);

	public AnswerEntity deleteAnswer(AnswerEntity answer);

	public List<AnswerEntity> getAnswerByQuestionId(int id);
}