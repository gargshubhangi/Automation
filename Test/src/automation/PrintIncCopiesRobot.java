package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintIncCopiesRobot {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;


	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.gecko.driver", path);
		driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		Actions builder= new Actions(driver);
		builder.keyDown(Keys.CONTROL).sendKeys("p").build().perform();
		
		Robot rob=new Robot();
		for (int i=1;i<=6;i++)
		{
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		}
		for (int j=1;j<=3;j++)
		{
			rob.keyPress(KeyEvent.VK_UP);
			rob.keyRelease(KeyEvent.VK_UP);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("successful print result");

	}

}
