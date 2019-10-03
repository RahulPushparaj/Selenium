package RobotActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDOMstructure_1 
{
		public static void main(String[] args) throws AWTException 
			{
				System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUMM\\Driver\\chromedriver.exe");
				WebDriver d = new ChromeDriver();
				d.get("https://www.facebook.com");
				Robot r = new Robot();
				
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_SHIFT);
				r.keyPress(KeyEvent.VK_I);
				
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_SHIFT);
				r.keyRelease(KeyEvent.VK_I);
				
				
			}

}
