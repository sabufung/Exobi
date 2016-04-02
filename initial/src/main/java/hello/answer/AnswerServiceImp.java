package hello.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImp implements AnswerService {

	@Autowired
	AnswerRepository repository;

	@Override
	public AnswerEntity getAnswerById(int id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public AnswerEntity getAnswerByQuestionId(int id) {
		// TODO Auto-generated method stub
		return repository.findAnswerByQuestionId(id);
	}

}