package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class jq {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Actions j = new Actions(driver);
        WebElement f= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
          driver.switchTo().frame(f);
		WebElement login= driver.findElement(By.id("draggable"));
		WebElement log= driver.findElement(By.id("droppable"));
		j.dragAndDrop(login, log).perform();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("droppable")).getText());
		
		}
}
