package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {

ChromeDriver driver; // declaring variable driver of class ChromeDriver
	
	void invokeBrowser() { // create method
		
		//Value of webDriver is updated by exe file, exe file is used by ChromeDriver class
		System.setProperty("webdriver.chrome.driver", "//Mac/Home/Documents/Selenium/WebDrivers/chromedriver.exe");
		
		driver = new ChromeDriver(); // initializing ChromeDriver
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies(); // does not delete, but bypass Cookies
		
		driver.get("http://demo.guru99.com/v4");
	
}
	public void printTitleOfThePage() {
		System.out.println(driver.getTitle());
	}
	public void login(String userEmailId, String password) {
		
		WebElement userId = driver.findElement(By.name("uid"));
		
		userId.sendKeys(userEmailId);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
				
	}
		
	}