package Actions.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException, IOException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
  WebElement source = driver.findElement(By.xpath("//div[@id='draggable']//p"));
	WebElement target = driver.findElement(By.xpath("//div[@id='droppable']//p"));
	Actions ac = new Actions(driver);
	ac.dragAndDrop(source, target).build().perform();
	Thread.sleep(4000);
	System.out.println("Sucessfully droped");
	driver.close();
	
	
}}
