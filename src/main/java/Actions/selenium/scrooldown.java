package Actions.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrooldown {
public static void main(String[] args) throws InterruptedException {

//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Drivers\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://mvnrepository.com/");
	
	
	
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	WebElement obj = driver.findElement(By.linkText("Docproc"));		
	
	


// scrool by using pixel	
//	js.executeScript("window.scrollBy(0,1550)", " ");
	
//		Scrooling webpage till we find the web element
	js.executeScript("arguments[0].scrollIntoView()", obj);

//scroll page till the end		
//  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
	System.out.println("Sucessfully scrowldown");
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
}}