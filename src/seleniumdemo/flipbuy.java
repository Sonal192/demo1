package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipbuy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement popup= driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		popup.click();
		List<WebElement> f= driver.findElements(By.xpath("//li[@class='Wbt_B2 _1YVU3_']/span[contains(.,'Women')]"));
		Actions d= new Actions(driver);
		Thread.sleep(2000);
		 for (WebElement menuName : f) {
			String item=menuName.getText();
			System.err.println(menuName.getText());
             d.moveToElement(menuName).build().perform();
             Thread.sleep(5000);
             WebElement flip= driver.findElement(By.xpath("//a[@title='Sarees']"));
	        flip.click();
	        WebElement f1= driver.findElement(By.xpath("//div[@data-id='SARFNTCGD3GGFDCZ']/div[@class='IIdQZO _1SSAGr']"));
	        f1.click();
	         //WebElement buy= driver.findElement(By.xpath(""));
	       //  buy.click();
	        // Actions k = new Actions(driver);
	       //  k.doubleClick(buy).perform();
	        
	        // WebElement f2= driver.findElement(By.xpath("//div[@class='ringselectformError parentFormbuy_block formError']"));
	       // System.out.println(f2.getText());
        }
}
}
