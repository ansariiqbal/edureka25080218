package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		driver.findElement(By.linkText("New Customer")).click();  //LinkText starts in html with <a (anchor tag) href=
		driver.findElement(By.name("name")).sendKeys("Sapna");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("01/01/1970");
		driver.findElement(By.name("addr")).sendKeys("Naya Daur Kevinipada");
		driver.findElement(By.name("city")).sendKeys("Mumbai");
		driver.findElement(By.name("state")).sendKeys("Maharahshtra");
		driver.findElement(By.name("pinno")).sendKeys("400102");
		driver.findElement(By.name("telephoneno")).sendKeys("9821400102");
		
		String emailId = "aa" + System.currentTimeMillis() + "@gmail.com";
		
		System.out.println("Email Id : " + emailId);
		driver.findElement(By.name("emailid")).sendKeys(emailId);
		driver.findElement(By.name("password")).sendKeys("gsdfdf");
		
		driver.findElement(By.name("sub")).click();
	}
	
	
	public String getCustomerId() {  // RETURN STRING VALUE
		return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
	}

	
	public void addAccount(String customerId) { //pass customr id string
		driver.findElement(By.linkText("New Account")).click();
		driver.findElement(By.name("cusid")).sendKeys(customerId);
		
		WebElement selAccountType = driver.findElement(By.name("selaccount")); // 1st identify dropdown as webelement
		Select dropdown = new Select(selAccountType);
		
		dropdown.selectByVisibleText("Current"); 
		boolean flag = dropdown.isMultiple();  //in 1 line - System.out.println(dropdown.isMultiple());
		System.out.println(flag);
		
		driver.findElement(By.name("inideposit")).sendKeys("15564");
		driver.findElement(By.name("button2")).click();
	}
	}