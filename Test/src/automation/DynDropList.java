package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynDropList {

	public static WebDriver driver;
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", path);
		driver=new FirefoxDriver();
		driver.navigate().to("http://www.ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@name='fromPlaceName']")).sendKeys("CHI");
		driver.findElement(By.xpath("//input[@name='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@name='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.xpath("//input[@name='fromPlaceName']")).getText());//no o/p with this
		//Selenium cannot identify hidden/invisible elements, therefore not printing.
		//Use Javascript DOM for that.
		
		//For using Javascript DOM in selenium, use JavascriptExecutor API.
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String)js.executeScript(script);
		System.out.println(text);
	}

}
