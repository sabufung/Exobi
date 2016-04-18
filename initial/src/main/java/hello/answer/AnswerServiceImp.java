package hello.answer;

import java.util.List;

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
	public List<AnswerEntity> getAnswerByQuestionId(int id) {
		// TODO Auto-generated method stub
		return repository.findAnswerByQuestionIdAndIsActiveTrue(id);
	}

	@Override
	public AnswerEntity insertAnswer(AnswerEntity answer) {
		// TODO Auto-generated method stub
		AnswerEntity check = repository.findOne(answer.getId());
		if (check == null) {
			return repository.saveAndFlush(answer);
		}
		return check;
	}

	@Override
	public AnswerEntity updateAnswer(AnswerEntity answer) {
		// TODO Auto-generated method stub
		AnswerEntity check = repository.findOne(answer.getId());
		if (check == null) {
			return check;
		}
		return repository.saveAndFlush(answer);
	}

	@Override
	public AnswerEntity deleteAnswer(AnswerEntity answer) {
		// TODO Auto-generated method stub
		AnswerEntity check = repository.findOne(answer.getId());
		if (check == null) {
			return check;
		}
		repository.delete(check);
		return check;
	}

}