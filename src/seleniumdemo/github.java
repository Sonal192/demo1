package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class github {
	public class guruexe {public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();                                           
		driver.manage().window().maximize();                                             
		driver.get("http://demo.guru99.com/test/upload");   
		Thread.sleep(2000);
		
		

}
