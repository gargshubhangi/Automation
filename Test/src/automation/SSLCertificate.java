package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificate {
	
	public static String path="C:\\\\Chromedriver 2.33\\\\chromedriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		DesiredCapabilities ch=new DesiredCapabilities();
		//Below 2 ways for accepting certificates
		/*1*/ ch.acceptInsecureCerts();
		/*2*/ ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver(c);
		driver.get("http://10.232.16.30:82 ");

	}

}
