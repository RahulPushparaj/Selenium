package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUMM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		List<WebElement> f = driver.findElements(By.tagName("iframe"));
		System.out.println("Inside the webpage="+f.size());
		driver.switchTo().frame("a077aa5e");
		List<WebElement> f1 = driver.findElements(By.tagName("iframe"));
		System.out.println("Inside the frame="+f1.size());//size = 1
		if (f1.size()>=1)
		{
			driver.switchTo().frame(0);
		}
		List<WebElement> f2 = driver.findElements(By.tagName("iframe"));
		System.out.println(f2.size());//size=1
		if(f2.size()>=1)
		{
			driver.switchTo().frame(0);
			List<WebElement> f3 = driver.findElements(By.id("email"));
			System.out.println(f3.size());//size=0
			driver.findElement(By.id("email")).sendKeys("RahulPushparaj");
		}		
		driver.switchTo().parentFrame();//inner frame to outer frame
		driver.switchTo().defaultContent();//frame to web page
	}

}
