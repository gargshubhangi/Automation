package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropdown {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;
    
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver= new FirefoxDriver();
		driver.get("http://www.spicejet.com/");   //navigate to url
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click(); //click on from text box
		driver.findElement(By.xpath("//a[@value='CCJ']")).click(); //click Kozhikode (source)
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click(); //click Bombay (dest) from 2nd text box..[2] is because both text boxes
		                                                                //have same value od places..[2] denotes 2nd textbox..follows top left approach.

	}

}
