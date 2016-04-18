package hello.question;

import org.dozer.Mapping;

import lombok.Data;

@Data
public class QuestionDTO {

	@Mapping("id")
	private int id;

	@Mapping("content")
	private String content;

	@Mapping("type")
	private String type;

	@Mapping("examId")
	private int examId;

	@Mapping("point")
	private double point;

}
