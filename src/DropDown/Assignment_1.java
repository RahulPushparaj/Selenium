package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUMM\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.gettyimages.in");
		d.findElement(By.xpath("//div[text()='Creative Images']")).click();
		d.findElement(By.xpath("//label[text()='Video']")).click();
	}
}
