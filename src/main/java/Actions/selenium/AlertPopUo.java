package Actions.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.findElement(By.name("proceed")).click();
	    
	    
	    Thread.sleep(5000);
	    
	    Alert al =driver.switchTo().alert();
	   System.out.println(al.getText());
	al.dismiss();
	//al.accept();
	//Thread.sleep(7000);
	driver.close();

	}
}
