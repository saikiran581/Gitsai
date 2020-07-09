package Actions.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
System.out.println(driver.findElements(By.tagName("a")).size());
WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
System.out.println(footerdriver.findElements(By.tagName("a")).size());
WebElement cloumnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
int count = cloumnDriver.findElements(By.tagName("a")).size();
System.out.println(count);
for(int i=1;i<count;i++)
{
	String clickTabs = Keys.chord(Keys.CONTROL,Keys.ENTER);
	cloumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickTabs);
	Thread.sleep(4000);
}

Set<String> sai = driver.getWindowHandles();
Iterator<String> it = sai.iterator();

while(it.hasNext())
{
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
	
}

	}

}
