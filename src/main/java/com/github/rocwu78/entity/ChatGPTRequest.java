package com.github.rocwu78.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "model", "messages" })
@Generated("jsonschema2pojo")
public class ChatGPTRequest {
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	@JsonProperty("frequency_penalty")
	private Double frequency_penalty;

	@JsonProperty("max_tokens")
	private Integer max_tokens;

	@JsonProperty("messages")
	private List<Message> messages = new ArrayList<Message>();

	@JsonProperty("model")
	private String model ;

	@JsonProperty("n")
	private Integer n;

	@JsonProperty("presence_penalty")
	private Double presence_penalty;

	@JsonProperty("stop")
	private String stop;

	@JsonProperty("stream")
	private Boolean stream;
	
	@JsonProperty("temperature")
	private Double temperature;
	
	@JsonProperty("top_p")
	private Double top_p;

	@JsonProperty("user")
	private String user;

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public Double getFrequency_penalty() {
		return frequency_penalty;
	}

	public Integer getMax_tokens() {
		return max_tokens;
	}

	@JsonProperty("messages")
	public List<Message> getMessages() {
		return messages;
	}

	@JsonProperty("model")
	public String getModel() {
		return model;
	}

	public Integer getN() {
		return n;
	}

	public Double getPresence_penalty() {
		return presence_penalty;
	}

	public String getStop() {
		return stop;
	}

	public Double getTemperature() {
		return temperature;
	}

	public Double getTop_p() {
		return top_p;
	}

	public String getUser() {
		return user;
	}

	public Boolean isStream() {
		return stream;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public void setFrequency_penalty(Double frequency_penalty) {
		this.frequency_penalty = frequency_penalty;
	}

	public void setMax_tokens(Integer max_tokens) {
		this.max_tokens = max_tokens;
	}

	@JsonProperty("messages")
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	@JsonProperty("model")
	public void setModel(String model) {
		this.model = model;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public void setPresence_penalty(Double presence_penalty) {
		this.presence_penalty = presence_penalty;
	}

	public void setStop(String stop) {
		this.stop = stop;
	}

	public void setStream(Boolean stream) {
		this.stream = stream;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public void setTop_p(Double top_p) {
		this.top_p = top_p;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		StringBuilder messageString = new StringBuilder();
		for (Message message : messages) {
			messageString.append(message.getContent());
			messageString.append("\n");
		}
		return "ChatGPTRequest [messages=" + messageString.toString()  + "]";
	}

}