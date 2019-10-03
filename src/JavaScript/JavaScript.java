package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScript extends BaseClass
{
	public static void main(String[] args) 
	{
		launchBrowser("https://www.facebook.com/");
		WebElement ele = push.findElement(By.id("email"));
		JavascriptExecutor js =(JavascriptExecutor)push;
		js.executeScript("arguments[0].setAttribute('value','Sathish')", ele);
		Object o = js.executeScript("return arguments[0].getAttribute('value')", ele);
		String s =(String)o;
		System.out.println(s);
		WebElement btn = push.findElement(By.id("loginbutton"));
		js.executeScript("arguments[0].click()", btn);
		//closeBrowser();
		
	}
}
