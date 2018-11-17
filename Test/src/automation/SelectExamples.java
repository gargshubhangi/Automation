package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExamples {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/basic_html_form.html");
		Select s=new Select(driver.findElement(By.name("dropdown")));
		/*s.deselectAll();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("success");
		s.selectByVisibleText("Selection Item 1");
		s.selectByVisibleText("Selection Item 3");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("success");
		s.deselectByVisibleText("Selection Item 1");
		System.out.println("success");*/
		
		WebElement e=driver.findElement(By.name("comments"));
		e.clear();
		if(s.isMultiple())
		{
			e.sendKeys("Supports multiple selection");
		}
		else
			e.sendKeys("Not Supports multiple selection");

	}

}
