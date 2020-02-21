package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class act {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement act = driver.findElement(By.xpath("	//td[@id='headerContainer']"));
		System.out.println(act.getText());
		WebElement acti = driver.findElement(By.xpath("//tr[6]//td[1]//table[1]//tbody[1]//tr[1]//td[1]//table//tbody//tr[1]//td[1]//input"));
		System.out.println(acti.getText());

}
}