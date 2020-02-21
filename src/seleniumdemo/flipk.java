package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//button[@ class='_2AkmmA _29YdH8']"));
		user.click();
		List<WebElement> f = driver.findElements(By.xpath("//div[@class='_3zdbog _3Ed3Ub']/ul/li"));
		Actions a= new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menuName : f) {
			String item=menuName.getText();
			System.err.println(menuName.getText());
             a.moveToElement(menuName).build().perform();
             Thread.sleep(2000);
             List<WebElement>submenus = driver.findElements(By.xpath("//span[contains(.,'"+item+"')]/parent::li/descendant::ul[@class='QPOmNK']/li"));
     		Thread.sleep(2000);
     		for (WebElement flip:submenus ) 
     		{
     			System.out.println(flip.getText());
     	
     		}
             
		}
}
}