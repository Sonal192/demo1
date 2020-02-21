package seleniumdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class google {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");  
	WebDriver driver = new ChromeDriver();                                           
	driver.manage().window().maximize();                                             
	driver.get("http://www.google.com/");          
	WebElement g=driver.findElement(By.name("q"));
	g.sendKeys("java",Keys.ENTER);
	/*WebElement j=driver.findElement(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt i8lZMc']/span[contains(.,'Java')]"));
	Actions a=new Actions(driver);
	a.doubleClick(j).perform();
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);*/
	WebDriverWait ww=new WebDriverWait(driver, 10);
	ww.until(ExpectedConditions.attributeContains(By.name("q"), "value", "java"));
	WebElement g1=driver.findElement(By.xpath("//a[@href='https://www.java.com/']"));
	g1.click();
	  System.out.println("search completed");   
}
}
