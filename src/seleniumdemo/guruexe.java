package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guruexe {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");  
	WebDriver driver = new ChromeDriver();                                           
	driver.manage().window().maximize();                                             
	driver.get("http://demo.guru99.com/test/upload");   
	Thread.sleep(2000);
	driver.findElement(By.id(""));
	
	
	
	WebElement user = driver.findElement(By.xpath("//input[@type='email']"));
	user.click();  
	WebElement user1 = driver.findElement(By.xpath("//input[@type='passsword']"));
	user1.click();;  
	WebElement user2 = driver.findElement(By.xpath("//input[@value='login']"));
	user2.click();;  


}
}