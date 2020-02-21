package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class gmaildemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com/");
		WebElement user = driver.findElement(By.id("identifierId"));
		user.sendKeys("sonalajagtap5@gmail.com");
		WebElement user1 = driver.findElement(By.id("identifier"));
		user1.click();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement user2= driver.findElement(By.name("password"));   
	       user2.sendKeys("7798859675");
	    WebElement pass= driver.findElement(By.id("passwordNext")); 
        pass.click();
	}

}
