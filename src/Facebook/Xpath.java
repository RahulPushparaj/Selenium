package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{ 
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\praveen\\Rahul\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement e = driver.findElement(By.xpath("//input[@type='email']"));
		e.sendKeys("Rahul");
		WebElement p = driver.findElement(By.xpath("//input[@type='password'][1]"));
		p.sendKeys("123");
		WebElement txt = driver.findElement(By.xpath("//span[text()='Create an account']"));
		String A = txt.getText();
		System.out.println(A);
		WebElement B = driver.findElement(By.xpath("//input[@type='submit']"));
		String C = B.getAttribute("value");
		System.out.println(C);
	
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
		btn.click();
		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
		a.sendKeys("Pushparaj");
		WebElement b = driver.findElement(By.xpath("//input[@type='password']"));
		b.sendKeys("123456789123456789123456789123456789123456789");	
		
	}

}
