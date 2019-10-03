package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		Thread.sleep(4000);
		d.findElement(By.name("btn btn-default")).click();
		
		
	}

}
