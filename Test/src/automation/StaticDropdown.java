package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static WebDriver driver;
	public static String path="";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver= new FirefoxDriver();
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("3");
	}

}
