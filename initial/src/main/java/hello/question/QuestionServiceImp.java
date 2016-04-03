package hello.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImp implements QuestionService {

	@Autowired
	QuestionRepository repository;

	@Override
	public QuestionEntity getQuestionById(int id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public List<QuestionEntity> getQuestionByExamId(int id) {
		// TODO Auto-generated method stub
		return repository.findQuestionByExamId(id);
	}

	@Override
	public QuestionEntity insertQuestion(QuestionEntity question) {
		// TODO Auto-generated method stub
		QuestionEntity check = repository.findOne(question.getId());
		if (check == null) {
			return repository.saveAndFlush(question);
		}
		return check;
	}

	@Override
	public QuestionEntity updateQuestion(QuestionEntity question) {
		// TODO Auto-generated method stub
		QuestionEntity check = repository.findOne(question.getId());
		if (check == null) {
			return check;
		}
		return repository.saveAndFlush(question);
	}

	@Override
	public QuestionEntity deleteQuestion(QuestionEntity question) {
		// TODO Auto-generated method stub
		QuestionEntity check = repository.findOne(question.getId());
		if (check == null) {
			return check;
		}
		repository.delete(check);
		return check;
	}

}
