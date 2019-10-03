package BaseClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends BaseMethod
{
	public static void main(String[] args) throws Throwable 
	{
		launchBrowser("https://www.facebook.com/");
		screenShot("D:\\PUSHPARAJ\\Screenshot\\Homepages.jpeg");
		WebElement d = push.findElement(By.id("email"));
		type(d,"RAHUL");
		WebElement p = push.findElement(By.id("pass"));
		type(p, "kv");
		WebElement btn = push.findElement(By.id("loginbutton"));
		click(btn);
		closeBrowser();
		screenShot("D:\\PUSHPARAJ\\Screenshot\\Loginpage.jpeg");
	}
}
