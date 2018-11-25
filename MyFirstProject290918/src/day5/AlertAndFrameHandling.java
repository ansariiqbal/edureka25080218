package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrameHandling {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver; // declaring variable driver of class ChromeDriver

		System.setProperty("webdriver.chrome.driver", "//Mac/Home/Documents/Selenium/WebDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame("iframeResult"); // frame id and name is available
		
		// to come back to main browser/frame
		// driver.switchTo().defaultContent(); 

		driver.findElement(By.tagName("button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.quit();
	}
}
