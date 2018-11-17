package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow2 {

	
		public static String driverpath = "C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
		public static void main(String[] args) {
			
			System.setProperty("webdriver.gecko.driver", driverpath);
			WebDriver driver = new FirefoxDriver();
			driver.get("http://linkedin.com/");
			driver.manage().window().maximize();
			String firstHandle = driver.getWindowHandle();
			System.out.println("main winndow handle\n" + firstHandle);
			
			driver.findElement(By.linkText("Help Center")).click();
			driver.findElement(By.xpath(".//*[@id='a11y-main']/div/div/div[1]/div/ul/li[1]")).click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			System.out.println(driver.getWindowHandles());
			for(String windohandle:driver.getWindowHandles())
			{ 
				driver.switchTo().window(windohandle);
			}
				
			driver.findElement(By.id("first-name")).sendKeys("cognizant");	
			driver.findElement(By.id("last-name")).sendKeys("srivastava");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.switchTo().window(firstHandle);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.findElement(By.id("desktop-search-query")).sendKeys("aramamamam");
			
			
	       	}


	}
	


