package com.studentapp.cucumber;

import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class StudentSteps {

	@When("^User sends a GET request to the list endpoint, they must get back a valid status code 200$")
	public void verify_status_code_200_for_listendpoint() {
		SerenityRest.rest()
		.given()
		.when()
		.get("/list")
		.then()
		.statusCode(200);		
	}
}
