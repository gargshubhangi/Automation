package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOpMultiSelectBox {
	
	public static String path="C:\\Users\\Shubhangi\\Desktop\\Selenium\\geckodriver.exe";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",path);
		driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/basic_html_form.html");
		Select s=new Select(driver.findElement(By.name("multipleselect[]")));
        s.deselectAll();
        
        WebElement tb= driver.findElement(By.name("comments"));
        tb.clear();
        s.selectByValue("ms1");
        s.selectByValue("ms2");
        s.selectByValue("ms3");
        
        //List <WebElement> select_all_options=s.getAllSelectedOptions(); //to retrieve selected options
        
        List <WebElement> select_all_options=s.getOptions();   // to select all options
        
        int count=select_all_options.size();
        System.out.println("Total elements present in multilist box"+" "+count);
        
        for(WebElement temp:select_all_options)
        {
        	String label_text=temp.getText();
        	tb.sendKeys(label_text);
        	tb.sendKeys("\n");
        }
	}

}
