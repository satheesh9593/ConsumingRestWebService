package io.sprinbootquickstart.ConsumingRestWebService;

public class Response {
	
	public RestResponse RestResponse;

	
	public Response() {
		super();
	}

	public RestResponse getRestResponse() {
		return RestResponse;
	}

	public void setRestResponse(RestResponse restResponse) {
		RestResponse = restResponse;
	}
	
	@Override
	public String toString()
	{
		return "Response[RestResponse="+RestResponse+"]";
	}
	
	

}
