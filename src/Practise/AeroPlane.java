package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AeroPlane 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.airindia.in");
		d.findElement(By.xpath("//a[text()='Book Flight']")).click();
		d.findElement(By.className("iCheck-helper")).click();
		d.findElement(By.id("from")).sendKeys("chennai");
		d.findElement(By.id("to")).sendKeys("delhi");
		d.findElement(By.id("_depdateeu1")).sendKeys("10/04/2019");
	}
}
