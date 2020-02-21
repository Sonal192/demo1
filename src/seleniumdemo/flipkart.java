package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.flipkart.com/");
			Thread.sleep(2000);
			WebElement flip = driver.findElement(By.xpath("//button [@class='_2AkmmA _29YdH8']"));
			flip.click();
		/*	WebElement flip2 = driver.findElement(By.xpath("//input[@type='text']"));
			flip2.sendKeys("mobiles",Keys.ENTER);*/		
			
		}
}
