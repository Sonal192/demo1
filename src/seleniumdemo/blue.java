package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class blue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bluestone.com/");
		Thread.sleep(5000);
		WebElement b= driver.findElement(By.xpath("//div[@class='gms-banner-inner']"));
		b.click();
		WebElement amt=driver.findElement(By.xpath("//input[@name='amount']"));
		amt.sendKeys("");
		Thread.sleep(2000);
		WebElement email1=driver.findElement(By.xpath("//div[@class='pink-bg-wrapper']/descendant::input[@type='email']"));
		email1.sendKeys("sonalajagtap5@gmail.com");
        Thread.sleep(2000);
		WebElement submit1=driver.findElement(By.xpath("//div[@class='pink-bg-wrapper']/descendant::input[@type='submit']"));
		submit1.click();
		WebElement sub =driver.findElement(By.xpath("//ul[@id='amount_error']"));
		System.out.println(sub.getText());
		WebElement logo =driver.findElement(By.xpath("//div[@class='col-xs-4 col-lg-4 logo']"));
	    logo.click();
******************************************************************************************************************************************
	    WebElement l= driver.findElement(By.xpath("//div[@class='gms-banner-inner']"));
		l.click();
	    WebElement amt1=driver.findElement(By.xpath("//input[@name='amount']"));
		amt1.sendKeys("1000");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//div[@class='pink-bg-wrapper']/descendant::input[@type='email']"));
		email.sendKeys("sonalajagtap5@gmail.com");
		Thread.sleep(5000);
		WebElement submit=driver.findElement(By.xpath("//div[@class='pink-bg-wrapper']/descendant::input[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		WebElement logoo =driver.findElement(By.xpath("//div[@class='col-xs-4 col-lg-4 logo']"));
		logoo.click();
}
}
