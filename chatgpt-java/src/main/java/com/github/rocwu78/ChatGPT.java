package com.github.rocwu78;

import java.io.IOException;
import java.nio.charset.UnsupportedCharsetException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.rocwu78.entity.ChatGPTRequest;
import com.github.rocwu78.entity.ChatGPTResponse;
import com.github.rocwu78.entity.Message;

public class ChatGPT {

	private static final String API_URL = "https://api.openai.com/v1/chat/completions";
	private String API_KEY;

	public ChatGPT(String apiKey) {
		this.API_KEY = apiKey;
	}
	
	public ChatGPTResponse sendRequest( ChatGPTRequest request) {

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(API_URL);
		httpPost.addHeader("Authorization", "Bearer " + API_KEY);
		httpPost.addHeader("Content-Type", "application/json");

		ObjectMapper objectMapper = new ObjectMapper();

		StringEntity requestEntity;
		try {
			requestEntity = new StringEntity(objectMapper.writeValueAsString(request), ContentType.APPLICATION_JSON);
			httpPost.setEntity(requestEntity);

			CloseableHttpResponse response = httpClient.execute(httpPost);
			return objectMapper.readValue(response.getEntity().getContent(), ChatGPTResponse.class);
		} catch (UnsupportedCharsetException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	public ChatGPTResponse sendRequest(String message) {
		ChatGPTRequest request = new ChatGPT35RequestBuilder().build();
		request.getMessages().add(new Message("user", message));
		return sendRequest(request);
	}

}
