package com.example.demo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http2ClientExample {
	public static void main(String[] args) throws Exception {
		HttpClient httpClient = HttpClient.newHttpClient();

		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://httpbin.org/get")).GET().build();

		HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

		System.out.println(httpResponse.body());
		/*{
			  "args": {}, 
			  "headers": {
			    "Host": "httpbin.org", 
			    "User-Agent": "Java-http-client/17.0.6", 
			    "X-Amzn-Trace-Id": "Root=1-645905da-17ffbec53a034f543554c8ee"
			  }, 
			  "origin": "165.85.55.102", 
			  "url": "https://httpbin.org/get"
		}*/
	}
}
