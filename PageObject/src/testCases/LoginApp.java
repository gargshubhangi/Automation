package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectRepository.RediffLoginPage;

public class LoginApp {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd= new RediffLoginPage(driver);
		rd.Email().sendKeys("hello");
		rd.Password().sendKeys("12345");
		rd.Submit().click();

	}

}
