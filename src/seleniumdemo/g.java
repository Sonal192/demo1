package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class g {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement guru = driver.findElement(By.xpath(" //button[@ondblclick='myFunction()']"));
	
		WebElement gr = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		

		Actions c = new Actions(driver);
		c.contextClick().perform();
		//g.doubleClick(guru).perform();
		
}
}
