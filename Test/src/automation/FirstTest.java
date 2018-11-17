package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTest {

	//public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\IEDriverServer.exe";
    public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver",path);
		driver = new InternetExplorerDriver();
		
		//  1.Navigating and clicking on any link
		driver.navigate().to("https://www.w3schools.com");
		System.out.println("success");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.out.println("success
		//driver.switchTo().frame("aswift_0");
		driver.findElement(By.xpath("//*[@class='w3-bar-block']/a[1]")).click();
		System.out.println("success");
		//System.out.println("success");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.out.println("success");
		driver.navigate().back();
		System.out.println("success");
		
		
		//2. Search mobile on amazon and go
		/*driver.navigate().to("http://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.xpath(".//input[@value='Go']")).click();*/
		
		//3. Select anything from dropdown list
		/*driver.navigate().to("http://www.seleniumeasy.com/test/");
		Thread.sleep(5000);
		driver.findElement(By.className("caret")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul[1]/li[3]/a")).click();*/
		
		
	}

}
