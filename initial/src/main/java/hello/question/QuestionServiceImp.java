package hello.question;

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
	public QuestionEntity getQuestionByExamId(int id) {
		// TODO Auto-generated method stub
		return repository.findQuestionByExamId(id);
	}

}
