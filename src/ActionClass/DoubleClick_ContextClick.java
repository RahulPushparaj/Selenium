package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_ContextClick 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver Rahul = new ChromeDriver();
		Rahul.get("https://www.facebook.com");
		WebElement e = Rahul.findElement(By.id("email"));
		e.sendKeys("sam.gfg.gfgd.dgfgdg.gdgd.gdgd.com");
		Actions a = new Actions(Rahul);
		
		//DOUBLECLICK AND CONTEXTCLICK/RIGHTCLICK
		//USES double click and right click
		a.doubleClick(e).perform();
		a.contextClick(e).perform();
		
		//KEYDOWN KEYUP
		//USES using shift key
		a.keyDown(e, Keys.SHIFT).sendKeys("kalai").keyUp(e,  Keys.SHIFT).perform();
		
	}

}
