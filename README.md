# ChatGPTJava
Java API for ChatGPT API 3.5 Turbo
Support all request parameters. 

Example: 

	public static void main(String[] args) {
		ChatGPT chatGPT = new ChatGPT("Your API Key");
		
		//Send a simple message
		ChatGPTResponse response = chatGPT.sendRequest("Write a job description for Jave Programer");
		System.out.println( response.getResponseMessage());
		
		
		//Send request with sepcified parameters and multiple messages
		ChatGPTRequest request = new ChatGPT35RequestBuilder().withTemperature(1.0).withFrequencyPenalty(1.1).withMaxTokens(1000).build();
		request.getMessages().add(new Message("system", "Your are a HR manager of an IT company"));
		request.getMessages().add(new Message("user", "Write a job description for Jave Programer"));
		
		response = chatGPT.sendRequest(request); 
		System.out.println( response.getResponseMessage());
	}
