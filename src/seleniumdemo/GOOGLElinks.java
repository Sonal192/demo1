package seleniumdemo;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GOOGLElinks {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();                                           
		driver.manage().window().maximize();                                             
		driver.get("http://www.google.com/");      
		WebElement g=driver.findElement(By.name("q"));
		g.sendKeys("java",Keys.ENTER);
	
		Thread.sleep(2000);
		List<WebElement>link =driver.findElements(By.tagName("a"));
		//Actions a=new Actions(driver);
		for (WebElement l : link) {
			System.out.println(l.getText());
			
		}
		

}
}
