package hello.exam;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ExamService {
	public ExamEntity getExamById(long id);

	public ExamEntity insertExam(ExamEntity exam);

	public ExamEntity updateExam(ExamEntity exam);

	public ExamEntity deleteExam(ExamEntity exam);

	public List<ExamEntity> getAllByTestDoneAsc();

	public List<ExamEntity> getAllExam();

	public List<ExamEntity> getExamBySubject(String subject);
}