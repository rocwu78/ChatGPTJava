package com.github.rocwu78;

import com.github.rocwu78.entity.ChatGPTResponse;

public class Example {
	
	public static void main(String[] args) {
		ChatGPT chatGPT = new ChatGPT("Your API Key");
		ChatGPTResponse response = chatGPT.sendRequest("Write a job description for Jave Programer");
		System.out.println( response.getResponseMessage());
		
	}

}
