package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartProject {
	
ChromeDriver driver; // declaring variable driver of class ChromeDriver
	
	void invokeBrowser() { // create method
		
		System.setProperty("webdriver.chrome.driver", "//Mac/Home/Documents/Selenium/WebDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //PAGE TIMEOUT
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //IMPLICIT WAIT
		driver.get("http://www.flipkart.com");	
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
	}
	
	public void mouseHover() {
		
		WebElement electronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions action = new Actions(driver);
		action.moveToElement(electronicsLink).build().perform();
		WebElement samsungLink = driver.findElement(By.linkText("Samsung"));
		action.moveToElement(samsungLink).click().build().perform();
	}
}
