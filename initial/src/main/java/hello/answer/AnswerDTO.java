package hello.answer;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.dozer.Mapping;

import lombok.Data;

@Data
public class AnswerDTO {

	@Mapping("id")
	private int id;

	@Mapping("content")
	private String answer;

	@Mapping("isCorrect")
	private boolean isTrue;

	@Mapping("questionId")
	private int questionId;

}
