package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhiteBackgroundPage {
	
	WebDriver driver;
	
	public WhiteBackgroundPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]") 
	WebElement WhiteButton; 

	@FindBy(how = How.XPATH, using = "//body[@style=\'background-color: white;\']") 
	WebElement SkyBlueElement;

	public void clickWhiteButton() {
		WhiteButton.click();

	}
	
}
