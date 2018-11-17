package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class WindowHandle {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", path);
		driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		String parent= driver.getWindowHandle(); //return name of current window
		
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		
		Set<String>ids=driver.getWindowHandles(); //return no of child windows
		
        Iterator<String> I1= ids.iterator();  //iterate using iterator
		
		while(I1.hasNext())
		{
			String child=I1.next();
			
			if(!child.equals(parent))
			{
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getTitle());
				driver.close();                                                  //after switching, closing all child windows
			}
		}
		
		driver.switchTo().window(parent);

	}

}
