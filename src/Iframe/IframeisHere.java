package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeisHere
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUMM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		
	}

}
