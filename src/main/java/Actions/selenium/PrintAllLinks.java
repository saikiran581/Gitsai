package Actions.selenium;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//driver.navigate().to("http://www.qaclickacademy.com/");

System.out.println( driver.findElements(By.tagName("a")).size());
WebElement footerPart = driver.findElement(By.id("gf-BIG"));
 
System.out.println(footerPart.findElements(By.tagName("a")).size());

 WebElement columnDriver = footerPart.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
 int count = columnDriver.findElements(By.tagName("a")).size();
 Thread.sleep(4000);
 System.out.println(count);
 for(int i=1;i<count;i++)
 {
	 String clickLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	 columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickLinkTab);
	 Thread.sleep(4000);
 }
	 Set<String> abc = driver.getWindowHandles();
	 Iterator<String> it= abc.iterator();
	 while(it.hasNext())
	 {
		 driver.switchTo().window(it.next());
		 System.out.println(driver.getTitle());
	 }
	 
	 
	 
	 
 }



//driver.close();
	}


