package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static WebDriver driver;
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver= new FirefoxDriver();
		
		driver.navigate().to("https://www.naukri.com/");
        
		String parent= driver.getWindowHandle();  // return the name of the current /parent window
		
		Set<String> s1= driver.getWindowHandles();  //return number of child windows( popup windows)
		
		Iterator<String> I1= s1.iterator();  //iterate using iterator
		
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
