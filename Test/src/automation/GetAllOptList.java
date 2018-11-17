package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptList {

	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/basic_html_form.html");
		
		WebElement tb=driver.findElement(By.name("comments"));
		tb.clear();
		
		Select li=new Select(driver.findElement(By.name("dropdown")));
		
		List <WebElement> list_options=li.getOptions();
		
		int get_count=list_options.size();
		System.out.println("Total elements present in list"+" "+get_count);
		
		for(WebElement temp:list_options)
		{
			String label_text=temp.getText();
			tb.sendKeys(label_text);
			tb.sendKeys("\n");
		}

	}

}
