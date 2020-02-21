package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class notepad {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/s1.html");
	WebElement ele=driver.findElement(By.id("b"));
	Select s=new Select(ele);
	List<WebElement> valu=s.getOptions();
	if(s.isMultiple())
		for (WebElement k: valu) {
			s.selectByValue(k.getText());
			Thread.sleep(1000);
			
		}
	System.out.println("************************************");
	List<WebElement>ss=s.getAllSelectedOptions();
	for (WebElement t : ss) {
		System.out.println(t.getText());	
	}
	
	s.deselectAll();
/*	for (WebElement k: valu) {
		s.deselectByValue(k.getText());
		
	}*/
		Thread.sleep(2000);
}
}