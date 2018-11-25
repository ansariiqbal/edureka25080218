package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils { // class name
	
	// method name, pass driver instance, By locator, how much time you want to wait
	public static void waitTillElementVisible(WebDriver driver, By by, int timeoutInSeconds) { 
		
		// creating instance of WebDriverWait CLASS
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		
		// put condition - ExpectedConditions.
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public static void fluentWait(WebDriver driver, int timeout, int pollingTime, By by){
		
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) // wait is interface
		.withTimeout(Duration.ofSeconds(timeout))
		.pollingEvery(Duration.ofSeconds(pollingTime)) // default time in Explicit Wait, we define in fluent
		.ignoring(NoSuchElementException.class); // default in Explicit Wait, we define in fluent
		

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
