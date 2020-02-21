package seleniumdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GOOGL {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();                                           
		driver.manage().window().maximize();                                             
		driver.get("http://www.google.com/");          
		WebElement g=driver.findElement(By.name("q"));
		g.sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> G =driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		Actions a=new Actions(driver);
		for (WebElement option : G) {
			System.out.println(option.getText());
		}
		G.get(3).click();
	}		
}
