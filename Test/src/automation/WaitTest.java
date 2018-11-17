package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", path);
		driver= new FirefoxDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);                 //IMPLICIT WAIT
		driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys("nyc");
		driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='H-fromDate']")).sendKeys(Keys.ENTER);
		
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'New-York-Hotels-PUBLIC')]")));  //EXPLICIT WAIT
		driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-PUBLIC')]")).click();
	}

}
