package seleniumdemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ih {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	String user="admin";
	String pass="admin";
	String url ="https://"+user+","+pass+"the-internet.herokuapp.com/basic_auth";
		driver.get(url);	
//sydsui
}
}
