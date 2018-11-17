package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMenu {

	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver = new FirefoxDriver();
		
		driver.get("http://store.demoqa.com/");
		
		WebElement menu= driver.findElement(By.xpath("//li[@id='menu-item-33']/a"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(menu).perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement submenu= driver.findElement(By.xpath("//li[@id='menu-item-33']/a"));
		
		action.moveToElement(submenu);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click();
		action.perform();

	}

}
