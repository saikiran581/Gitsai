package Actions.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNotifications {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
	// Toavoid browser notifications	
		ChromeOptions co = new ChromeOptions();
		co.addArguments("- -disable-notication");
		driver.get("http://www.facebook.com/");
	}

}



