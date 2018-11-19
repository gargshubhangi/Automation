package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;


public class KillPrcssCookies {
	
	public static String path="C:\\\\Chromedriver 2.33\\\\chromedriver.exe";
	public static WebDriver driver;

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		WindowsUtils.killByName("excel.exe"); //deprecated method (Here closing all the excels opened)
		

	}

}
