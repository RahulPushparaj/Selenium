package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateFixer
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\SELENIUMM\\Driverr\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.redbus.in");
		d.findElement(By.id("src")).sendKeys("chennai");
		d.findElement(By.id("dest")).sendKeys("Tuticorin");
		d.findElement(By.id("onward_cal")).click();
		
	}
}
