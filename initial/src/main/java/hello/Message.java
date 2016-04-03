package hello;

public class Message {
	private int code;
	private String result;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Message(int code, String result) {
		super();
		this.code = code;
		this.result = result;
	}

}
