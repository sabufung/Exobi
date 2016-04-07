package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.question.QuestionEntity;
import hello.question.QuestionService;

@RestController
public class QuestionController {
	@Autowired
	QuestionService questionService;

	@RequestMapping(value = "/getQuestionByExamId", method = RequestMethod.GET)
	public List<QuestionEntity> getQuestionByExamId(@RequestParam("id") int id) {
		return questionService.getQuestionByExamId(id);
	}

}
