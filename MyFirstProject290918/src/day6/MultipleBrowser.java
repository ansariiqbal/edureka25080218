package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleBrowser {

WebDriver driver; 
	
	void invokeBrowser(String browserType) { // create method
		
		if(browserType.equals("firefox")) {
			
		System.setProperty("webdriver.gecko.driver", "//Mac/Home/Documents/Selenium/WebDrivers/geckodriver.exe");
		driver = new FirefoxDriver(); // initializing FirefoxDriver
		}
		
		if(browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "//Mac/Home/Documents/Selenium/WebDrivers/chromedriver.exe");
			driver = new ChromeDriver();	
		}
		
		if(browserType.equals("edge")) {
			
			driver = new EdgeDriver();	
		}
		
		
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
