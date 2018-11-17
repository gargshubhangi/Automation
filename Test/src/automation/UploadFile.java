package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {
		
		public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
		public static WebDriver driver;
			
		public static void main(String[] args) throws InterruptedException{
			
			System.setProperty("webdriver.gecko.driver",path);
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Success time wait until navigate");
			driver.navigate().to("http://demo.guru99.com/selenium/upload/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Success time wait after navigate");
			driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Shubhangi\\Desktop\\abc.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Success time wait after file");
			driver.findElement(By.id("terms")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Success time wait after clicking checkbox");
			driver.findElement(By.id("submitbutton")).click();

	}

}
