package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIn {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",path);
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shubhangi.garg72@yahoo.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("lovygarg123#");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
