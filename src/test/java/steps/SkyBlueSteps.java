package steps;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SkyBlueBackgroundPage;
import util.BrowserFactory;

public class SkyBlueSteps {
	WebDriver driver;
	SkyBlueBackgroundPage skyBlueBackgroundPage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		skyBlueBackgroundPage=PageFactory.initElements(driver, SkyBlueBackgroundPage.class);
	}

	@Given("^user is on \"([^\"]*)\" page$")
	public void user_is_on_page(String arg1){
		
	}

	@When("^user Clicks Skyblue background button$")
	public void user_Clicks_Skyblue_background_button(){
		skyBlueBackgroundPage.clickSkyBlueButton();
	}

	@Then("^the background should turn Skyblue$")
	public void the_background_should_turn_Skyblue(){
		String expectedColor = "#87ceeb";
		String color = driver.findElement(By.xpath("//body[@style='background-color: skyblue;']")).getCssValue("background-color");
		String actualHex = Color.fromString(color).asHex();
		Assert.assertEquals("Background color did not match", expectedColor, actualHex);
	}
}
