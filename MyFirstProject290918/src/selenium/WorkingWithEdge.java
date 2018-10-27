package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithEdge {

EdgeDriver driver; // declaring variable driver of class ChromeDriver
	
	void invokeBrowser() { // create method
		
		//Value of webDriver is updated by exe file, exe file is used by ChromeDriver class
		System.setProperty("webdriver.edge.driver", "//Mac/Home/Documents/Selenium/WebDrivers/MicrosoftWebDriver.exe");
		
		driver = new EdgeDriver(); // initializing Edge
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // does not delete, but bypass Cookies
		driver.get("http://qatechhub.com");	
}
	
	
	String getPageTitle() {
		return driver.getTitle();
	}
	
	void navigateComands() {
		driver.navigate().to("http://www.facebook.com");
		System.out.println("Navigate : " + driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Back : " + driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Forward : " + driver.getTitle());
		
		driver.navigate().refresh();
		System.out.println("Refresh : " + driver.getTitle());
	}
	
	void closeBrowser() {
		// driver.close(); // close single window
		driver.quit();  // close all windows (kill from task manager as well)
	}

}
