package seleniumdemo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		Thread.sleep(2000);
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		Set<String> wins=driver.getWindowHandles();
		ArrayList<String> a1 = new ArrayList<>(wins);
		for(int i= a1.size()-1;i>=0;i--){
			driver.switchTo().window(a1.get(i));
		Thread.sleep(2000);
		driver.close();
		}
		
	}
		
		
		}
		
		
		


