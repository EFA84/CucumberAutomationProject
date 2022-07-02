package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SkyBlueBackgroundPage;
import page.WhiteBackgroundPage;
import util.BrowserFactory;

public class WhiteSteps {
	
	WebDriver driver;
	WhiteBackgroundPage whiteBackgroundPage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		whiteBackgroundPage=PageFactory.initElements(driver, WhiteBackgroundPage.class);
	}
	
	@Given("^user is on the \"([^\"]*)\" page$")
	public void user_is_on_the_page(String arg1){
		driver.get("https://techfios.com/test/101/index.php");
	}

	@When("^user Clicks White background button$")
	public void user_Clicks_White_background_button(){
		whiteBackgroundPage.clickWhiteButton();
	}

	@Then("^the background should turn White$")
	public void the_background_should_turn_White(){
		String expectedColor = "#ffffff";
		String color = driver.findElement(By.xpath("//body[@style='background-color: white;']")).getCssValue("background-color");
		String actualHex = Color.fromString(color).asHex();
		Assert.assertEquals("Background color did not match", expectedColor, actualHex);

	}

}
