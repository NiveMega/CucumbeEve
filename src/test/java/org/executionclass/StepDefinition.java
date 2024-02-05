package org.executionclass;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition extends BaseClass{
	public static WebDriver driver;
	@Given("To launch edge Browser")
	public void toLaunchEdgeBrowser() {
	 loadBrowser();
	}

	@Given("To maximize the browser")
	public void toMaximizeTheBrowser() {
	   maximizePage();
	}

	@Then("To launch url")
	public void toLaunchUrl() {
	    launchUrl("https://www.facebook.com/");
	  //for LoginPage
	  		writeExcel("AdactinLogin", "login", 5, 5, "login");
	  		createRowOnly("AdactinLogin", "login", 0, 0, "UserName");
	  		createCellOnly("AdactinLogin", "login", 0, 1, "Password");
	  		
	  		createRowOnly("AdactinLogin", "login", 1, 0, "saiAvanthika");
	  		createCellOnly("AdactinLogin", "login", 1, 1, "SuganSharvesh");
	}
	@Then("to give valid id")
	public void toGiveValidId() {
		ElementsFb e = new ElementsFb();
		sendData(e.getUsername(), readDataFromExcel("AdactinLogin", "login", 1, 0));
	}

	@Then("to give valid password")
	public void toGiveValidPassword() {
		ElementsFb e = new ElementsFb();
		sendData(e.getPassword(),readDataFromExcel("AdactinLogin", "login", 1, 1));
	}
}
