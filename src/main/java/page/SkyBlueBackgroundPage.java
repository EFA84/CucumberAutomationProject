package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBlueBackgroundPage {
	
	WebDriver driver;
	
	public SkyBlueBackgroundPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]") 
	WebElement SkyBlueButton; 

	@FindBy(how = How.XPATH, using = "//body[@style=\'background-color: skyblue;\']") 
	WebElement SkyBlueElement;

	public void clickSkyBlueButton() {
		SkyBlueButton.click();
		
	}
	
}
