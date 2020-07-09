package Actions.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
    WebElement dd = driver.findElement(By.id("month"));
    Select sel = new Select(dd);
    List<WebElement> allmonths = sel.getOptions();
    for(int i=0;i<allmonths.size();i++)
    {
    	sel.selectByIndex(5);
    	System.out.println(allmonths.get(i).getText());
    }
    System.out.println("Total months are displayed sucesssfully");
	driver.close();
	
	
	
	
	
	
	
	
	
}}