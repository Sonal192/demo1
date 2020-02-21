package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoprac {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.com/");
		Thread.sleep(2000);
		
		List<WebElement> at = driver.findElements(By.xpath("//div[@id='block_top_menu']/descendant::ul"));
		Actions a= new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menuName : at) {
			String item=menuName.getText();
			System.err.println(menuName.getText());
             a.moveToElement(menuName).build().perform();
             Thread.sleep(2000);
             List<WebElement>submenus = driver.findElements(By.xpath("//div[@id='block_top_menu']/descendant::li"));
     		Thread.sleep(2000);
     		for (WebElement auto:submenus ) 
     		{
     			System.out.println(auto.getText());
     	
     		}
             
             
		}      
             
}
	}
