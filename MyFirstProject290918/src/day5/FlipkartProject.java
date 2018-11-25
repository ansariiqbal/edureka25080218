package day5; // IMPLICIT, EXPLICIT and FLUENT wait


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utils.WaitUtils;

public class FlipkartProject {
	
ChromeDriver driver; // declaring variable driver of class ChromeDriver
	
	void invokeBrowser() { // create method
		
		System.setProperty("webdriver.chrome.driver", "//Mac/Home/Documents/Selenium/WebDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //PAGE TIMEOUT
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //IMPLICIT WAIT
		driver.get("http://www.flipkart.com");	
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click(); // close popup box
		
	}
	
	public void mouseHover() throws InterruptedException {
		
		WebElement electronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions action = new Actions(driver);
		action.moveToElement(electronicsLink).build().perform();
		
		// EXPLICIT WAIT (conditional wait)
		//WaitUtils.waitTillElementVisible(driver, By.linkText("Samsung"), 5); // calling class WaitUtils
		
		// FLUENT WAIT (conditional wait with additional control)
		WaitUtils.fluentWait(driver, 5, 1, By.linkText("Samsung"));
		
		WebElement samsungLink = driver.findElement(By.linkText("Samsung"));
		String urlOfTheLink = samsungLink.getAttribute("href"); // by Attribute value
		System.out.println("URL of Samsung link : " + urlOfTheLink);
		
		action.moveToElement(samsungLink).click().build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
