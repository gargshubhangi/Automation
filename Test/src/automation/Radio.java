package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", path);
		driver= new FirefoxDriver();
		driver.get("https://www.skyscanner.co.in/");
		System.out.println(driver.findElement(By.xpath(".//*[@id='js-trip-type']/label[1]")).isEnabled());
		//System.out.println("success1");
		driver.findElement(By.xpath(".//*[@id='js-trip-type']/label[3]")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='js-trip-type']/label[1]")).isEnabled());
		driver.findElement(By.xpath("//button/span[1]")).click();
		int count=5;
		for(int i=0;i<count;i++)
		{
		driver.findElement(By.className("increment adults")).click();
	    }
	
}}
