package io.sprinbootquickstart.ConsumingRestWebService;

import java.util.Arrays;

public class RestResponse {
	
	public String[] messages;
	public Result result;
	
	public RestResponse() {
		super();
	}
	
	
	public String[] getMessages() {
		return messages;
	}
	public void setMessages(String[] messages) {
		this.messages = messages;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	
	@Override
	public String toString()
	{
		return "RestReponse [messages=" + Arrays.toString(messages)+ 
					",Result=" + result.toString()+"]";
		
	}
	
	
	

}
