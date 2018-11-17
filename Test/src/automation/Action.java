package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Action {

	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
		Actions a= new Actions(driver);
		//a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("wallet").build().perform();
		

	}

}
