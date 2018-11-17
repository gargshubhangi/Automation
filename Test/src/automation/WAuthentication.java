package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WAuthentication {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver",path);
		driver = new FirefoxDriver();
		String uname="username";
		String pwd="username";
		String TEST_ENVIRONMENT="www.engprod-charter.net/";
		String URL = "http://" + uname + ":" + pwd + "@" + TEST_ENVIRONMENT;   //this functionality has been removed from all browsers due to security reason
		driver.get(URL);
		System.out.println("success");
		
		driver.close();

	}

}
