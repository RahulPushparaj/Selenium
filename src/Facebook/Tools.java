package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Tools 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement a = driver.findElement(By.xpath("//input[@name='firstname']"));
		a.sendKeys("Rahul");
		WebElement b = driver.findElement(By.xpath("//input[@id='lastname']"));
		b.sendKeys("Pushparaj");
		WebElement c = driver.findElement(By.xpath("//input[@id='sex-0']"));
		c.click();
		WebElement d = driver.findElement(By.xpath("//input[@id='exp-0']"));
		d.click();
		WebElement e = driver.findElement(By.xpath("//input[@id='datepicker']"));
		e.sendKeys("19/07/2019");
		WebElement f = driver.findElement(By.xpath("//input[@id='profession-1']"));
		f.click();
		WebElement g = driver.findElement(By.xpath("//input[@id='photo']"));
		g.click();
		WebElement h = driver.findElement(By.xpath("//input[@id='tool-2']"));
		h.click();
		WebElement i = driver.findElement(By.xpath("//select[@id='continents']"));
		i.click();
		WebElement j = driver.findElement(By.xpath("//div[@class='controls'][3]"));
		j.click();
		WebElement k = driver.findElement(By.xpath("//button[@id='submit']"));
		k.click();
	}
}
