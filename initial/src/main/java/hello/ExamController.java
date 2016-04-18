package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.exam.ExamEntity;
import hello.exam.ExamService;
import hello.question.QuestionEntity;

@RestController
public class ExamController {

	@Autowired
	ExamService examService;

	@RequestMapping(value = "/getExamStatistic", method = RequestMethod.GET)
	public List<ExamEntity> getExamStatistic() {
		List<ExamEntity> result = examService.getAllByTestDoneAsc();
		return result;
	}

	@RequestMapping(value = "/getAllExam", method = RequestMethod.GET)
	public List<ExamEntity> getAllExam() {
		List<ExamEntity> result = examService.getAllExam();
		return result;
	}

}
