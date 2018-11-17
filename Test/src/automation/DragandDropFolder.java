package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropFolder {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver = new FirefoxDriver();
		
		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		 
		driver.get(URL);
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		 
		WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		 
		WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		 
		Actions builder = new Actions(driver);
		 
		Action dragAndDrop = builder.clickAndHold(From)
		 
		.moveToElement(To)
		 
		.release(To)
		 
		.build();
		 
		dragAndDrop.perform();
		 
		}
		 
		
		
		//builder.dragAndDrop(from, to).build().perform();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}


