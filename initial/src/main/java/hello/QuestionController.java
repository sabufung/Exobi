package hello;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.question.QuestionDTO;
import hello.question.QuestionEntity;
import hello.question.QuestionService;

@RestController
public class QuestionController {
	@Autowired
	QuestionService questionService;

	@Autowired
	DozerBeanMapper mapper;

	@RequestMapping(value = "/getQuestionByExamId", method = RequestMethod.GET)
	public List<QuestionDTO> getQuestionByExamId(@RequestParam("id") int id) {
		List<QuestionDTO> result = new ArrayList<>();
		List<QuestionEntity> queryResult = questionService.getQuestionByExamId(id);
		for (QuestionEntity e : queryResult) {
			result.add(mapper.map(e, QuestionDTO.class));
		}
		return result;
	}

	// @RequestMapping(value = "/createQuestions", method = RequestMethod.POST)
	// public List<QuestionEntity> createQuestions(@RequestBody
	// List<QuestionEntity> questions) {
	// for (QuestionEntity e : questions) {
	// questionService.insertQuestion(e);
	// }
	// return questions;
	// }
}
