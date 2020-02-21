package seleniumdemo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ul {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement user = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		user.click();
		WebElement ul = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		System.out.println(ul.getText());
		WebElement D = driver.findElement(By.xpath("//li[@class='topnav_item diningunit']"));
		System.out.println(D.getText());
		WebElement st = driver.findElement(By.xpath("//li[@class='topnav_item storageunit']"));
		System.out.println(st.getText());
		WebElement s2 = driver.findElement(By.xpath("//span[ contains(.,'Sale')]"));
		System.out.println(s2.getText());
		/*WebElement s3 = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
		System.out.println(s3.getText());*/
		WebElement s4 = driver.findElement(By.xpath("//li[@class='topnav_item bedroomunit']"));
		System.out.println(s4.getText());
		WebElement s5 = driver.findElement(By.xpath("//li[@class='topnav_item studyunit']"));
		System.out.println(s5.getText());
		WebElement s6 = driver.findElement(By.xpath("//li[@class='topnav_item mattressesunit']"));
		System.out.println(s6.getText());
		WebElement s7 = driver.findElement(By.xpath("//li[@class='topnav_item decorunit']"));
		System.out.println(s7.getText());
		WebElement s8 = driver.findElement(By.xpath("//li[@class='topnav_item newunit']"));
		System.out.println(s8.getText());
		WebElement s9 = driver.findElement(By.xpath("//li[@class='topnav_item collectionsunit']"));
		System.out.println(s9.getText());
		WebElement s10= driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/following-sibling::li"));
		System.out.println(s10.getText());
		WebElement s11 = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/following::span[contains(.,'Living')]"));
		System.out.println(s11.getText());
		WebElement s12 = driver.findElement(By.xpath("//span[contains(.,'Sale')]/ancestor::div[@id='topnav_wrapper']"));
		System.out.println(s12.getText());
		
		
		
	}
}
