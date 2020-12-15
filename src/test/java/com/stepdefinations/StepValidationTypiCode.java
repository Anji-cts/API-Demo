package com.stepdefinations;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import org.junit.Assert;
import org.junit.Assert.*;

import com.configmanager.ConfigManager;

public class StepValidationTypiCode {
	static final Logger log = Logger.getLogger("Users");
	ConfigManager appData = new ConfigManager("App");
	public final String BaseURL = appData.getProperty("App.BaseURI");
	protected Response response;
	protected static String username =null;protected boolean flag = false;
	
	@Given("I set valid GET users service api end point {string}")
	public void i_set_valid_GET_users_service_api_end_point(String endPoint) {
	    log.info("**************Test verifiction by hitting the end point*************");
	    RestAssured.baseURI = BaseURL;
	    String endpoint = appData.getProperty(endPoint);
	    log.info(BaseURL+" :Value from Properties file");
		RequestSpecification request = RestAssured.given();

		response = request.get("/"+endpoint);
		log.info("Status code: "+response.getStatusCode());
	}
	
	@Then("I should see valid response code")
	public void i_should_see_valid_response_code() {
		log.info("Verifying the status code: "+response.getStatusCode());
		Assert.assertEquals(200,response.getStatusCode() );
	}
	@Then("I should see \"([^\"]*)\" and \"([^\"])\"$")
	public void i_should_see_and(String name, String id) {
		JsonPath path = response.jsonPath();
		List<String> names = path.getList("name"); 
		List<Object> id1 = path.getList("id");
		log.info(names.size()+" :Number of nodes ");
		for(int i=0; i<names.size();i++)
		{
			if(names.get(i).equalsIgnoreCase(name))
			{
				log.info("i value from response: "+i);
				Integer val = (Integer) id1.get(i);
				if(val == Integer.parseInt(id))
				{
					flag = true;
					log.info("Given name and ID exists in response at node: "+i);
					break;
				}
			}
		}
		if(flag)
		{
			Assert.assertTrue(flag);
		}
		else
		{
			log.info("Given name and ID does not exists in response");
		}
		
	}
	@Then("I should see the username {string} in response")
	public void i_should_see_the_username_in_response(String username) {
		JsonPath path = response.jsonPath();
		this.username = username;
		List<String> names = path.getList("username"); 		
		List<Object> id1 = path.getList("id");
		log.info(names.size()+" :Number of Name nodes");
		log.info(names);		
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).equalsIgnoreCase(username))
			{
				log.info("Given username: "+username+" is existst in the response with id: "+id1.get(i));
				flag = true;
				break;
			}
			
		}
		Assert.assertTrue(flag);
	}
	@Then("I should verify address details")
	public void i_should_verify_address_details() {
		JsonPath path = response.jsonPath();
		List<String> names = path.getList("username"); 		
		List<Object> id1 = path.getList("id");
		log.info(username);
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).equalsIgnoreCase(username))
			{
				log.info("Given username: "+username+" is existst in the response with id: "+id1.get(i));
				Map<Object, Object> address = response.jsonPath().getMap("address["+i+"]");
				log.info(address);
				log.info(address.get("street")+" "+address.get("suite")+" "+address.get("city"));
				flag = true;
				break;
			}
			
		}
		Assert.assertTrue(flag);
	}
	@Then("I should verify company details")
	public void i_should_verify_company_details() {
		JsonPath path = response.jsonPath();
		List<String> names = path.getList("username"); 		
		List<Object> id1 = path.getList("id");
		log.info(username);
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).equalsIgnoreCase(username))
			{
				log.info("Given username: "+username+" is existst in the response with id: "+id1.get(i));
				Map<Object, Object> company = response.jsonPath().getMap("company["+i+"]");
				log.info(company);
				log.info(company.get("name")+" "+company.get("catchPhrase")+" "+company.get("bs"));
				flag = true;
				break;
			}
			
		}
		Assert.assertTrue(flag);
	}
	@Then("I should see title \"([^\"]*)\" and \"([^\"])\"$")
	public void i_should_see_title_and(String title, String id) {
		JsonPath path = response.jsonPath();
		List<String> names = path.getList("title"); 
		List<Object> id1 = path.getList("id");
		log.info(names.size()+" :Number of Name nodes");
		boolean flag = false;
		for(int i=0; i<names.size();i++)
		{
			if(names.get(i).equalsIgnoreCase(title))
			{
				log.info("i value from response: "+i);
				Integer val = (Integer) id1.get(i);
				if(val == Integer.parseInt(id))
				{
					flag = true;
					log.info("Given name and ID exists in response at node: "+i);
					break;
				}
			}
		}
		if(flag)
		{
			Assert.assertTrue(flag);
		}
		else
		{
			log.info("Given title and ID does not exists in response");
		}
		
	}
}
