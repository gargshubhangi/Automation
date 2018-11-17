package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.jws.soap.SOAPBinding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar2 {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;


	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", path);
		driver= new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("hp-widget__depart")).click();
		
		String date= "30-October 2017";
		String splitter[]= date.split("-");
		String daypart= splitter[0];
		String monthpart= splitter[1];
		fromDate_Select(daypart,monthpart);
		
	}
	
	public static void fromDate_Select(String fromday,String fromMonth)
	{
		List<WebElement> Month= driver.findElements(By.xpath(".//*[@class='dateFilter hasDatepicker']/div/div/div/div"));
		int monthsize=Month.size();
		for(int i=0;i<monthsize;i++)
		{
			String nodemonth= Month.get(i).getText();
			System.out.println(nodemonth);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			if(nodemonth.equalsIgnoreCase(fromMonth))
			{
				List<WebElement> Day= driver.findElements(By.xpath(".//*[@class='dateFilter hasDatepicker']/div/div/table/tbody/tr/td"));
				int daysize=Day.size();
				for(int j=0;j<daysize;j++)
				{
					String nodeday= Day.get(j).getText();
					System.out.println(nodeday);
					if(nodeday.equalsIgnoreCase(fromday))
					{
						driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
						Day.get(j).click();
					}
			}
		}
	}
		
		driver.findElement(By.xpath(".//*[@class='dateFilter hasDatepicker']/div/div[2]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@class='dateFilter hasDatepicker']/div/div[2]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fromDate_Select(fromday,fromMonth);
}
}
