package com.github.rocwu78;

import java.util.ArrayList;
import java.util.List;

import com.github.rocwu78.entity.ChatGPTRequest;
import com.github.rocwu78.entity.Message;

public class ChatGPT35RequestBuilder {
    private Double frequencyPenalty;
    private Integer maxTokens;
    private List<Message> messages = new ArrayList<Message>();;
    private String model = "gpt-3.5-turbo";
    private Integer n;
    private Double presencePenalty ;
    private String stop;
    private Boolean stream;
    private Double temperature;
    private Double topP;
    private String user;

    public ChatGPT35RequestBuilder withFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }

    public ChatGPT35RequestBuilder withMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    public ChatGPT35RequestBuilder withMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public ChatGPT35RequestBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    public ChatGPT35RequestBuilder withN(Integer n) {
        this.n = n;
        return this;
    }

    public ChatGPT35RequestBuilder withPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }

    public ChatGPT35RequestBuilder withStop(String stop) {
        this.stop = stop;
        return this;
    }

    public ChatGPT35RequestBuilder withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }

    public ChatGPT35RequestBuilder withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    public ChatGPT35RequestBuilder withTopP(Double topP) {
        this.topP = topP;
        return this;
    }

    public ChatGPT35RequestBuilder withUser(String user) {
        this.user = user;
        return this;
    }

    public ChatGPTRequest build() {
        ChatGPTRequest request = new ChatGPTRequest();
        request.setFrequency_penalty(this.frequencyPenalty);
        request.setMax_tokens(this.maxTokens);
        request.setMessages(this.messages);
        request.setModel(this.model);
        request.setN(this.n);
        request.setPresence_penalty(this.presencePenalty);
        request.setStop(this.stop);
        request.setStream(this.stream);
        request.setTemperature(this.temperature);
        request.setTop_p(this.topP);
        request.setUser(this.user);
        return request;
    }
}