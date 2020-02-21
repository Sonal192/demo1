package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(10000);
		/*WebElement user = driver.findElement(By.xpath("//body[@class='fk-modal-visible']"));
		user.click();*/
		List<WebElement> ul = driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		for (WebElement item : ul) {
			System.out.println(item.getText());
		}
		
	}
}