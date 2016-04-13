package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.answer.AnswerEntity;
import hello.answer.AnswerService;
import hello.question.QuestionEntity;
import hello.question.QuestionService;

@RestController
public class AnswerController {
	@Autowired
	AnswerService answerService;

	@RequestMapping(value = "/getAnswerByQuestionId", method = RequestMethod.GET)
	public List<AnswerEntity> getAnswerByQuestionId(@RequestParam("id") int id) {
		return answerService.getAnswerByQuestionId(id);
	}

	@RequestMapping(value = "/createAnswer", method = RequestMethod.GET)
	public List<AnswerEntity> createAnswer(@RequestBody List<AnswerEntity> answers) {
		for (AnswerEntity e : answers) {
			answerService.insertAnswer(e);
		}
		return answers;
	}

}
