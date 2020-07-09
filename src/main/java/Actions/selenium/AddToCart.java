package Actions.selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;
		 String[] itemsAdded= {"Cucumber","Brocolli","Beetroot ","Cauliflower "};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
        for(int i=0;i<products.size();i++)
        {
        	List<String> itemsAddedList = Arrays.asList(itemsAdded);
        	 String[] names=products.get(i).getText().split("-");
        	 String formatedNames = names[0].trim();
        	 
        	if(itemsAddedList.contains(formatedNames)) {
        		j++;
        		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        		if(j==3)
        			break;
        	}
        }
        Thread.sleep(3000);
driver.close();
	}

}
