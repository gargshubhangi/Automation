package sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static String path="C:\\\\Chromedriver 2.33\\\\chromedriver.exe";
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("Z:\\Cognizant QA\\Shubhangi\\Automation\\Test\\Screenshots\\fb.png"));
		System.out.println("Screenshot taken and captured in the path");

	}

}
