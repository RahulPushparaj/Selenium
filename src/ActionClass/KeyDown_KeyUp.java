package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_KeyUp 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver Rahul = new ChromeDriver();
		Rahul.get("https://www.facebook.com");
		WebElement e = Rahul.findElement(By.id("email"));
		Actions a = new Actions(Rahul);
	
		//KEYDOWN KEYUP
		//USES using shift key
		a.keyDown(e, Keys.SHIFT).sendKeys("kalai").keyUp(e,  Keys.SHIFT).perform();

	}
}