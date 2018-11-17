package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class CountLinks {

	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\chromedriver.exe";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		System.out.println("Number of links in the page is:");
		//Count links in a page
		System.out.println(driver.findElements(By.tagName("a")).size()); 
		//Count links in page footer
		WebElement footer=driver.findElement(By.xpath("//footer[@id='glbfooter']")); 
		System.out.println("Number of links in the footer is:");
		System.out.println(footer.findElements(By.tagName("a")).size());
		//Count links in one section of the footer
		WebElement footersection=driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[2]/ul"));
		System.out.println("No of links in 2nd column of footer section is:");
		System.out.println(footersection.findElements(By.tagName("a")).size());
		int count=footersection.findElements(By.tagName("a")).size();
		for(int i=0;i<count;i++)
		{
			System.out.println(footersection.findElements(By.tagName("a")).get(i).getText());
			System.out.println("\n");
			if(footersection.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				System.out.println("Title of page before clicking Site map is:");
				System.out.println(driver.getTitle());
				footersection.findElements(By.tagName("a")).get(i).click();
				break;
			}
			
		}
		System.out.println("Title of page after clicking Site map is:");
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
        
	}

}
