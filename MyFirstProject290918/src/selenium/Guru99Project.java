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
	
	public void addCustomer() {
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("Sapna");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("01/01/1970");
		driver.findElement(By.name("addr")).sendKeys("Naya Daur Bld, Kevinipada, SV Road");
		driver.findElement(By.name("city")).sendKeys("Mumbai");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("pinno")).sendKeys("400102");
		driver.findElement(By.name("telephoneno")).sendKeys("9821400102");
		
		String emailId = "aa" + System.currentTimeMillis() + "@gmail.com";
		System.out.println("Email Id: " + emailId);
		driver.findElement(By.name("emailid")).sendKeys(emailId);
		driver.findElement(By.name("password")).sendKeys("gsdfdf");
		
		driver.findElement(By.linkText("sub")).click();
				
	}
		
	}