package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandle2 {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", path);
		driver= new FirefoxDriver();
		
		driver.navigate().to("http://toolsqa.com/automation-practice-switch-windows/");
		System.out.println(driver.getTitle());
		String parent=driver.getWindowHandle();  //returns the unique id of parent
		System.out.println(parent);
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		Set<String> childs=driver.getWindowHandles();
		System.out.println(childs);  //returns no of child windows
	    
		for(String c:childs)
		{
			System.out.println(driver.switchTo().window(c).getTitle()); //return title of child windows
		}
	}
	

}
