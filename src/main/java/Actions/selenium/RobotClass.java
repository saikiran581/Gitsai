package Actions.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		driver.get("https://ninite.com/");
		driver.findElement(By.xpath("//input[@id='cb_2qq4h']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit' and @ accesskey='g']")).click();
//    Window popup save file
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_KP_LEFT);
		r.keyRelease(KeyEvent.VK_KP_LEFT);
        driver.close();	
	}

}
	


