package Actions.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement obj = driver.findElement(By.name("firstname"));
		obj.sendKeys("saikiran");
	//Double click	
		Actions ac = new Actions(driver);
		ac.doubleClick(obj).perform();
		
		
		obj.sendKeys(Keys.CONTROL+"c");
		WebElement obj1 = driver.findElement(By.name("lastname"));
		Thread.sleep(3000);
		obj1.sendKeys(Keys.CONTROL+"v");
		System.out.println("Sucessfully copied the text into last name");
		
		
	}

}
