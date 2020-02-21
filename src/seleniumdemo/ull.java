package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ull {
	private static WebElement menuName;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement user = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		user.click();
		List<WebElement> ul = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a= new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menuName : ul) //to print menus
		{
			String item=menuName.getText();
			System.err.println(item);//err used to print headings in red color
             a.moveToElement(menuName).build().perform();
             Thread.sleep(2000);
		
		/*WebElement u = driver.findElement(By.xpath("//span[contains(. ,'Sale')]/parent::li/descendant::ul[@class="taxonslist"]/li"));
		Actions a1= new Actions(driver);*/
		List<WebElement>submenus = driver.findElements(By.xpath("//span[contains(. ,'"+item+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
		Thread.sleep(2000);
		for (WebElement name :submenus ) //to print submenus
		{
			System.out.println(name.getText());
	
		}
		}
		}
	}
	
