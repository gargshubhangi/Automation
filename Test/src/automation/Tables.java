package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
	
	public static WebDriver driver;
	public static String path="C:\\Chromedriver 2.33\\chromedriver.exe";
	

	public static void main(String[] args) {
		
		int sum=0;
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
	    
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20741/sl-vs-afg-3rd-match-group-b-asia-cup-2018");
		//find the table
		WebElement table=driver.findElement(By.xpath("//div[@id='innings_1']/div[1]"));
		//count no of rows in table
		int rowcount=table.findElements(By.xpath("//div[@id='innings_1']/div[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).size();
		
		//follows parent to child method
		System.out.println("RUNS SCORED BY PLAYERS ARE:");
		for(int i=0;i<rowcount-2;i++)
		{
			
			System.out.println(table.findElements(By.xpath("//div[@id='innings_1']/div[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText());
			String value=table.findElements(By.xpath("//div[@id='innings_1']/div[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText();
			int valueint=Integer.parseInt(value);
			sum=sum+valueint;
		}
		
		//follows parent to sibling method
		System.out.println("EXTRAS ARE:");
		System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText());
		String extra=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText();
		int extraint=Integer.parseInt(extra);
		sum=sum+extraint;
		System.out.println("Total no of runs by the team is:"+sum);
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText());
		String total=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText();
		int totalint=Integer.parseInt(total);
		if(sum==totalint)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	

}
