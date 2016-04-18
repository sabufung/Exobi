
package hello;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.answer.AnswerEntity;
import hello.answer.AnswerService;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@RestController
public class HelloController {

	public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

	OkHttpClient client = new OkHttpClient();

	String post(String url, String json) throws IOException {
		RequestBody body = RequestBody.create(JSON, json);
		Request request = new Request.Builder().url(url).post(body).build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}

	String run(String url) throws IOException {
		Request request = new Request.Builder().url(url).build();

		Response response = client.newCall(request).execute();
		return response.body().string();
	}

	@Autowired
	AnswerService answerService;

	@RequestMapping("/ok")
	public String getJSON() throws IOException {

		String json = "[{\"id\":1,\"content\":\"phuonglhk\",\"type\":\"multiple\",\"examId\":1,\"point\":1.0},{\"id\":2,\"content\":\"sdad\",\"type\":\"choice\",\"examId\":1,\"point\":0.5}]";
		String response = post("http://localhost:8080/test", json);
		return response;

	}

}
