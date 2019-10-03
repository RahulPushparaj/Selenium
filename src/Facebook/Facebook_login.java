package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		WebElement a = driver.findElement(By.id("email"));
		a.sendKeys("Surender");
		//WebElement b = driver.findElement(By.name("pass"));
		//b.sendKeys("123456");
		//driver.findElement(By.tagName(""))
	
		WebElement c = driver.findElement(By.id("u_0_a"));
		String b = a.getAttribute("value");
		System.out.println(a);
		c.click();
		driver.quit();
	}

}
