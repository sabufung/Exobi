package hello.exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImp implements ExamService {

	@Autowired
	ExamRepository repository;

	@Override
	public ExamEntity getExamById(long id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public List<ExamEntity> getAllByTestDoneAsc() {
		return repository.findAllByOrderByTestDone();
	}

	@Override
	public List<ExamEntity> getAllExam() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public ExamEntity insertExam(ExamEntity exam) {
		// TODO Auto-generated method stub
		ExamEntity check = repository.findOne(exam.getId());
		if (check == null) {
			return repository.saveAndFlush(exam);
		}
		return check;
	}

	@Override
	public ExamEntity updateExam(ExamEntity exam) {
		// TODO Auto-generated method stub
		ExamEntity check = repository.findOne(exam.getId());
		if (check == null) {
			return check;
		}
		return repository.saveAndFlush(exam);
	}

	@Override
	public ExamEntity deleteExam(ExamEntity exam) {
		// TODO Auto-generated method stub
		ExamEntity check = repository.findOne(exam.getId());
		if (check == null) {
			return check;
		}
		repository.delete(check);
		return check;
	}

	@Override
	public List<ExamEntity> getExamBySubject(String subject) {
		// TODO Auto-generated method stub
		return repository.findBySubject(subject);
	}

}