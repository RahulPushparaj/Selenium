package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbuss 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\praveen\\Rahul\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement a = driver.findElement(By.xpath("//input[@type='text'][1]"));
		a.sendKeys("chennai");
		WebElement b = driver.findElement(By.xpath("//input[@type='text'][2]"));
		b.sendKeys("Australia");
	}

}
