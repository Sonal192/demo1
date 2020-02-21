package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bluestone.com/");
		Thread.sleep(2000);
		
	/*	List<WebElement> b= driver.findElements(By.xpath("//a[@title='Jewellery']"));
		Actions c= new Actions(driver);
		Thread.sleep(2000);
		
        for (WebElement menuName : b) {
			String item=menuName.getText();
			System.err.println(menuName.getText());
             c.moveToElement(menuName).build().perform();
             Thread.sleep(2000);
             WebElement blu= driver.findElement(By.xpath("//a[@title='Kadas']"));
	         blu.click();
	         WebElement bl= driver.findElement(By.xpath("//div[@class='pr-i lazy-bg']/descendant::span[@class='p-wrap']/a[@id='pid_8966']"));
	         bl.click();
	         WebElement buy= driver.findElement(By.xpath(" //div[@class='buynow-block col-xs-7']"));
	         buy.click();
	        // Actions k = new Actions(driver);
	       //  k.doubleClick(buy).perform();
	        //WebElement b2= driver.findElement(By.xpath("//div[@class='ringselectformError parentFormbuy_block formError']"));
	      //  System.out.println(b2.getText());
	         WebElement msg= driver.findElement(By.xpath(" //div[@class='formErrorContent']"));
	         System.out.println(msg.getText());
        }*/
		
}
}