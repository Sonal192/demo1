package seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();                                           
		driver.manage().window().maximize();                                             
		driver.get("http://demo.guru99.com/v1/index.php");                                             
		WebElement user = driver.findElement(By.xpath("//input[@type='submit']"));
		user.click();  
		Alert a=driver.switchTo().alert();
      System.out.println(a.getText());
	a.accept();
WebElement v= driver.findElement(By.xpath("//iframe[@id='Video-iFrame-SekindoSPlayer5e4d1df4d8b38' ]"));

	}
}
