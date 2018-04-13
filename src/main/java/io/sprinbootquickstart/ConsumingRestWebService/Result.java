package io.sprinbootquickstart.ConsumingRestWebService;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	
	public String name;
	public String alpha2_code;
	public String alpha3_code;
	
	
	public Result() {
		super();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlpha2_code() {
		return alpha2_code;
	}
	public void setAlpha2_code(String alpha2_code) {
		this.alpha2_code = alpha2_code;
	}
	public String getAlpha3_code() {
		return alpha3_code;
	}
	public void setAlpha3_code(String alpha3_code) {
		this.alpha3_code = alpha3_code;
	}
	
	@Override
	public String toString()
	{
		return "Result [name=" + name + ", alpha2_code=" 
				+ alpha2_code + ", alpha3_code=" + alpha3_code + "]";
	}
	
	

}
