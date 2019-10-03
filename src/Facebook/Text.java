package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.facebook.com/");
		WebElement b = a.findElement(By.xpath("//span[contains(text(),'Creat')]"));
		String c = b.getText();
		System.out.println(c);
		WebElement d = a.findElement(By.xpath("//input[@type='submit']"));
		String e = d.getAttribute("value");
		System.out.println(e);
		
	}

}
