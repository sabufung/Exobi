
package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.answer.AnswerEntity;
import hello.answer.AnswerService;
import hello.exam.ExamEntity;
import hello.exam.ExamService;
import hello.question.QuestionEntity;
import hello.question.QuestionService;
import hello.user.UserService;

@RestController
public class HelloController {

	@Autowired
	AnswerService answerService;


	@RequestMapping(value = "/getAnswer", method = RequestMethod.POST)
	public List<AnswerEntity> getAnswer(@RequestParam("id") int id) {
		return answerService.getAnswerByQuestionId(id);
	}

}
