package automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshot {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.co.in/");

		try
		{
			driver.findElement(By.id("testing")).sendKeys("test");
		}
		
		catch(Exception e)
		{
			System.out.println("I m an exception");
			
			File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\Shubhangi\\Desktop\\Selenium\\workspace\\Test\\Screenshot\\screenshot1.png"));
		}
	
	}
	
	

}
