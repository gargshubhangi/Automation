package automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowEx2 {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", path);
		driver= new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
		String parent=driver.getWindowHandle();  //get parent window name
		
		driver.findElement(By.xpath("//button[@onclick='newMsgWin()']")).click();
		
		Set<String> c1=driver.getWindowHandles(); //number of child windows
		System.out.println(c1);
		
		for(String child:driver.getWindowHandles())
		{
			System.out.println(child);
			driver.switchTo().window(child);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		driver.close();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().window(parent);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();
	}

}
