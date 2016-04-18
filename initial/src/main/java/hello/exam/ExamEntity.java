package hello.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_exam")
public class ExamEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "exam_id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "level")
	private int level;

	@Column(name = "testdone")
	private int testDone;

	@Column(name = "subject")
	private String subject;

	@Column(name = "is_active")
	private boolean isActive;

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getTestDone() {
		return testDone;
	}

	public void setTestDone(int testDone) {
		this.testDone = testDone;
	}

}
