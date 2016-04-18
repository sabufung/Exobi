package hello.answer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_answer")
public class AnswerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "answer_id")
	private int id;

	@Column(name = "answer_content")
	private String content;

	@Column(name = "is_correct")
	private boolean isCorrect;

	@Column(name = "question_id")
	private int questionId;

	@Column(name = "is_active")
	private boolean isActive;

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
