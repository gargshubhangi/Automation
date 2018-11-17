package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicRadio {

	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver= new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Milk']")).click();      //Method 1
		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++)
		{
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();   //Method 2
			
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"); //Method 3
			if(text=="Cheese")
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		

	}
}
