package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urban {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.urbanladder.com/");
		Thread.sleep(10000);
		//WebElement user = driver.findElement(By.xpath("//a[@class='google-auth']"));
		//user.click();
		//WebElement us = driver.findElement(By.xpath("//input[@type='email']"));
		//us.sendKeys("sonalajagtap5@gmail.com");
		//WebElement usr = driver.findElement(By.xpath("//input[@data-primary-action-label='Next']"));
		//usr.click();
		WebElement clos = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		clos.click();
		WebElement store = driver.findElement(By.xpath("//a[contains(.,'Stores')]"));
		store.click();
	    WebElement s = driver.findElement(By.xpath("//div[@class='_3oCTi']"));
		System.err.println(s.getText());
	}
}
