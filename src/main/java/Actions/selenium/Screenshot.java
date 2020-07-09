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
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Screenshot {
public static void main(String[] args) throws InterruptedException, IOException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
   TakesScreenshot ts = (TakesScreenshot)driver;
    File src = ts.getScreenshotAs(OutputType.FILE);
   File dest = new File("C:\\Users\\dell\\Desktop\\screenshots\\sai.jpg");
	Files.copy(src, dest);
	System.out.println("Screenshot sucessfully captured");
	driver.close();
	
	
	
	
	
	
}}