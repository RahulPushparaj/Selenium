package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckInsideIframeSize

{
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUMM\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	
	List<WebElement> f = driver.findElements(By.tagName("iframe"));
	System.out.println("Inside the webpage="+f.size());
	driver.switchTo().frame("_mN_main_224278574_0_n");
	List<WebElement> f1 = driver.findElements(By.tagName("iframe"));
	System.out.println("Inside the frame="+f1.size());
	}
}
