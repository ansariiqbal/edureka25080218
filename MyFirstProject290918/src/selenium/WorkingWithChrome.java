package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	ChromeDriver driver; // declaring variable driver of class ChromeDriver
	
	void invokeBrowser() { // create method
		
		//Value of webDriver is updated by exe file, exe file is used by ChromeDriver class
		System.setProperty("webdriver.chrome.driver", "//Mac/Home/Documents/Selenium/WebDrivers/chromedriver.exe");
		
		driver = new ChromeDriver(); // initializing ChromeDriver
		Dimension dim = new Dimension(600, 600); // instead of maximize if required
		
		driver.manage().window().setSize(dim);
		
		// driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies(); // does not delete, but bypass Cookies
		
		driver.get("http://qatechhub.com");
		
	}
	
	String getPageTitle() {
		return driver.getTitle();	
	}
	
	void navigateComands() {
		driver.navigate().to("http://www.facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}
	
	void closeBrowser() {
		// driver.close(); // close single window
		driver.quit();  // close all windows (kill from task manager as well)
	}

}
