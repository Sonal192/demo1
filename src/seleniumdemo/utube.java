package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class utube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youtube.com/");
		Thread.sleep(2000);
		 WebElement you= driver.findElement(By.xpath("//div[@id='buttons']/descendant::a[@class='yt-simple-endpoint style-scope ytd-button-renderer']"));
	      you.click();
	      WebElement ph = driver.findElement(By.xpath("//div[@class='xkfVF']/descendant::div[@class='Xb9hP']/input[@type='email']"));
			ph.sendKeys("sonalajagtap5@gmail.com");
			 WebElement next = driver.findElement(By.xpath("//div[@class='xkfVF']/descendant::div[@id='identifierNext']"));
             next.click();
	}
	
}