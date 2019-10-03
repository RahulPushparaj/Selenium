package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\PUSHPARAJ\\\\SELENIUM\\\\Driver\\\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.facebook.com/");
		
	}

}
