package common.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static java.net.http.HttpClient.Version;
import static java.net.http.HttpClient.newBuilder;

public class CustomHttpClient {
	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient httpClient = newBuilder()
				.version(Version.HTTP_2)
				.build();

		HttpRequest request = HttpRequest.newBuilder()
				.POST(HttpRequest.BodyPublishers.ofString("{\"email\":\"p.a.chechetkin@gmail.com\",\"password\":\"agentbars0007\",\"recaptcha_user_response\":\"\",\"recaptcha_secret_version\":\"v1\",\"recaptcha_platform\":\"web\",\"lang\":\"ru\",\"visitorId\":\"8016f31262e94e850cb9ce4d8869d78b\"}"))
				.uri(URI.create("https://www.kufar.by/l/api/login/v2/auth/signin?token_type=user"))
				.setHeader("User-Agent", "Java 11 HttpClient Bot")
				.build();

		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

		// print status code
		System.out.println(response.statusCode());

		// print response body
		System.out.println(response.body());

	}


}
