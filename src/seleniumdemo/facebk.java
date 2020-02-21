package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
	Thread.sleep(2000);
	WebElement fname=driver.findElement(By.xpath("//input[@aria-label='First name']"));
	fname.sendKeys("sona");
	WebElement lastname=driver.findElement(By.xpath("//input[@aria-label='Surname']"));
	lastname.sendKeys("jagtap");
	WebElement email=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	email.sendKeys("sonaljagtap192@gmail.com");
	WebElement reemail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	email.sendKeys("sonaljagtap192@gmail.com");
	
WebElement pass=driver.findElement(By.xpath("//input[@type='password']']"));
	pass.sendKeys("selenium@123");
	WebElement fb=driver.findElement(By.id("day"));
	Select s=new Select(fb);
	s.selectByValue("19");
	WebElement mon=driver.findElement(By.id("month"));
	Select h=new Select(mon);
	h.selectByIndex(2);
	WebElement y =driver.findElement(By.id("year"));
	Select a =new Select(y);
	a.selectByVisibleText("1998");
	List<WebElement>days=s.getOptions();
	for (WebElement d : days) {
		System.out.println(d.getText());
	}
	WebElement fe =driver.findElement(By.xpath("//input[@value='1']"));
	fe.click();
	WebElement sign =driver.findElement(By.xpath("//div[@class='_1lch']/button[@type='submit']"));
	sign.click();
	}
}
