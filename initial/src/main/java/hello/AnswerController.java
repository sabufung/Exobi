package hello;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.answer.AnswerDTO;
import hello.answer.AnswerEntity;
import hello.answer.AnswerService;

@RestController
public class AnswerController {
	@Autowired
	AnswerService answerService;
	@Autowired
	DozerBeanMapper mapper;

	@RequestMapping(value = "/getAnswerByQuestionId", method = RequestMethod.GET)
	public List<AnswerDTO> getAnswerByQuestionId(@RequestParam("id") int id) {
		List<AnswerDTO> result = new ArrayList<>();
		List<AnswerEntity> queryResult = answerService.getAnswerByQuestionId(id);
		for (AnswerEntity e : queryResult) {
			result.add(mapper.map(e, AnswerDTO.class));
		}
		return result;
	}

}
