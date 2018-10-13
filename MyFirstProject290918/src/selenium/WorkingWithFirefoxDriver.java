package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithFirefoxDriver {
	
	FirefoxDriver driver; // declaring variable driver of class Firefox
	
	void invokeBrowser() { // create method
		System.out.println("Start");
		//Value of webDriver is updated by exe file, exe file is used by Firefox class
		System.setProperty("webdriver.gecko.driver", "//Mac/Home/Documents/Selenium/WebDrivers/geckodriver.exe");
		
		driver = new FirefoxDriver(); // initializing FirefoxDriver
		// Dimension dim = new Dimension(600, 600); // instead of maximize if required
		
		// driver.manage().window().setSize(dim);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies(); // does not delete, but bypass Cookies
		
		driver.get("http://qatechhub.com");
		
	}
	
	String getPageTitle() {
		return driver.getTitle();
		
		
	}
	
	void navigateComands() {
		driver.navigate().to("http://www.facebook.com");
		
		driver.navigate().back();
		System.out.println("back");
		
		driver.navigate().forward();
		System.out.println("forward");
		
		driver.navigate().refresh();
		System.out.println("refresh");
	}
	
	void closeBrowser() {
		// driver.close(); // close single window
		driver.quit();  // close all windows (kill from task manager as well)
	}

}
