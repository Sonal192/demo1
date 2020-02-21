package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbdemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Aliya");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Aliya");
		WebElement log_In = driver.findElement(By.id("login Button"));
		log_In.Click();
		

	}

}