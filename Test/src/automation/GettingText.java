package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingText {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver = new FirefoxDriver();
		
		driver.navigate().to("http://book.theautomatedtester.co.uk");
		String mainheading=driver.findElement(By.className("mainheading")).getText();
		System.out.println("successful getting text");
		driver.findElement(By.id("q")).sendKeys(mainheading);
		System.out.println("successful printing");

	}

}
