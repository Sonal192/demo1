package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mha {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.myntra.com/");
		Thread.sleep(2000);
		
		List<WebElement> m = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div[@class='desktop-navContent']"));
		Actions a= new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menuName : m) 
		{
			String item=menuName.getText();
			System.err.println(item);
             a.moveToElement(menuName).build().perform();
             Thread.sleep(2000);
		List<WebElement>submenus = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/descendant::div[@class='desktop-categoryContainer']/descendant::li[@class='desktop-oddColumnContent']"));
		Thread.sleep(2000);
		for (WebElement my :submenus ) 
		{
			System.out.println(my.getText());
	
		}
		}
}
	}