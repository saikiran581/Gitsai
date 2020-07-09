package Actions.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimentionsOfTextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.google.com/");
	driver.navigate().to("https://www.facebook.com/");
	
	WebElement tb = driver.findElement(By.id("u_0_q"));
	
	int width=tb.getSize().getWidth();
	int height=tb.getSize().getHeight();

	System.out.println("width of the textbox is "+width +" Height of the textbox is "+height);
	
	
//	WebElement gt = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
//	 to get the name of attribute
//	System.out.println(gt.getAttribute("name"));

	driver.close();
	}


}
