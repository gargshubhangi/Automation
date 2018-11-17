package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	public RediffLoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	WebDriver driver;
	
	By username= By.xpath("//input[@id='login1']");
	By password= By.name("passwd");
	By loginbtn= By.name("proceed");
	
	public WebElement Email()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(loginbtn);
	}

}
