package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBookAss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www//facebook.com");
		WebElement login = driver.findElement(By.xpath("//label[@class='login_form_login_button uiButton uiButtonConfirm']"));
		Actions ac = new Actions(driver);
		ac.contextClick(login).perform();
		ac.contextClick().perform();
		
		
	}

}
