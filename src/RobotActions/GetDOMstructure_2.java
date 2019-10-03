package RobotActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetDOMstructure_2
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUMM\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com");
		WebElement f = d.findElement(By.xpath("//div[@class='_5iyx']"));
		Actions a = new Actions(d);
		a.contextClick(f).perform();
		Robot r = new Robot();
		for (int i = 0; i <= 7; i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			System.out.println(i);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	}
}
