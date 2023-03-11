package com.github.rocwu78.entity;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"message",
"finish_reason",
"index"
})
@Generated("jsonschema2pojo")
public class Choice {

@JsonProperty("message")
private Message message;
@JsonProperty("finish_reason")
private String finishReason;
@JsonProperty("index")
private Integer index;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("message")
public Message getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(Message message) {
this.message = message;
}

@JsonProperty("finish_reason")
public String getFinishReason() {
return finishReason;
}

@JsonProperty("finish_reason")
public void setFinishReason(String finishReason) {
this.finishReason = finishReason;
}

@JsonProperty("index")
public Integer getIndex() {
return index;
}

@JsonProperty("index")
public void setIndex(Integer index) {
this.index = index;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}