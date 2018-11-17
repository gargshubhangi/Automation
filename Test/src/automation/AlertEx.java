package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AlertEx {
	
	//public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\IEDriverServer.exe";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver",path);
		//driver = new FirefoxDriver();
		driver = new InternetExplorerDriver();
		
		driver.get("file:///C:\\Users\\Shubhangi\\Desktop\\Selenium\\HTML\\prompt.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Alert alert=driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Shubhangi Garg");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("success");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		alert.accept();
		System.out.println("success");
	}

}
