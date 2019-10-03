package Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateFixing 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUMM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.findElement(By.id("src")).sendKeys("Chennai");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		//driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.id("rb-onward_cal"));
		List<WebElement> date = d.findElements(By.tagName("tr"));
		//for (WebElement new : date) 
	//	{
	//		new.get
		//	
	//	}
	}
}
