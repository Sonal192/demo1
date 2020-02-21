package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement usr = driver.findElement(By.name("username"));
		usr.sendKeys("admin");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		Thread.sleep(1000);
		// WebElement user2 =
		// driver.findElement(By.xpath("//b[text()='admin']"));
		// System.out.println(user2.getText());
		WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']"));
		login.click();
		Thread.sleep(2000);
		WebElement q = driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']"));
		q.click();
		 WebElement abt= driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]"));
		 abt.click();
		 WebElement p= driver.findElement(By.xpath("//span[contains(.,'© 2020 actiTIME Inc. All rights reserved.')]"));
		 System.out.println(p.getText());
		 

		// Thread.sleep(2000);
		/*
		 * WebElement logout = driver.findElement(By.xpath(
		 * "//tr[@class='logoutContainer']/descendant::a[@id='logoutLink']"));
		 * logout.click();
		 */
		/*
		 * WebDriverWait ww=new WebDriverWait(driver, 10);
		 * ww.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//tr[@class='logoutContainer']/descendant::a[@id='logoutLink']")));
		 * WebElement a1=driver.findElement(By.xpath(
		 * "//tr[@class='logoutContainer']/descendant::a[@id='logoutLink']"));
		 * a1.click(); System.out.println("search completed");
		 */

	}
}
