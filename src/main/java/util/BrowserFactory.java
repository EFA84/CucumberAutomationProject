package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver; 
	 
	public static WebDriver startBrowser () {  
		
	  System.setProperty("webdriver.chrome.driver", "/Users/guest1/Desktop/TechFios/DEC2021/SELENIUM/CucumberAutomationProject/driver/chromedriver");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://techfios.com/test/102/index.php");
	  return driver;  
	 } 
	
 }