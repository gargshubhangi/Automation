package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioCheck {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver = new FirefoxDriver();
		
		// RADIOBUTTON CLICK BY ID
		/*driver.navigate().to("https://www.goibibo.com/");
		driver.findElement(By.id("gi_roundtrip_label")).click(); */
		
		//By isSelected and other functions
		driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.id("u_0_2")).sendKeys("Shubhangi");
        driver.findElement(By.id("u_0_4")).sendKeys("Garg");
        driver.findElement(By.id("u_0_7")).sendKeys("shbhnggrg@gmail.com");
        driver.findElement(By.id("u_0_e")).sendKeys("lovygarg123#");
        Select birthDay= new Select(driver.findElement(By.name("birthday_day")));
        birthDay.selectByVisibleText("21");
        Select birthMonth= new Select(driver.findElement(By.name("birthday_month")));
        birthMonth.selectByIndex(5);
        Select birthYear= new Select(driver.findElement(By.name("birthday_year")));
        birthYear.selectByVisibleText("1991");
        boolean status=driver.findElement(By.id("u_0_h")).isEnabled();
        if(status=true)
        {
        	System.out.println("Female radio button enabled"+""+status);
        	driver.findElement(By.id("u_0_h")).click();
        }
        if(true)
        {
        	System.out.println("Female radio button is selected");
        	
        	 }

}}
