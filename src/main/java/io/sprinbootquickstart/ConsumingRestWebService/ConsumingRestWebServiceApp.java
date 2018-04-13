package io.sprinbootquickstart.ConsumingRestWebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
public class ConsumingRestWebServiceApp implements CommandLineRunner 
{
	public static final Logger log = LoggerFactory.getLogger(ConsumingRestWebServiceApp.class);
	
	
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumingRestWebServiceApp.class, args);
    }


	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
    	Response response = restTemplate.getForObject("http://services.groupkt.com/country/get/iso2code/IN",
                Response.class);
    	log.info(response.toString());
    	
		
	}
}
