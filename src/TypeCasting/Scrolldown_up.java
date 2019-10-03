package TypeCasting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown_up 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\praveen\\Rahul\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		WebElement down = driver.findElement(By.xpath("//a[text()='Katalon']"));
		WebElement up = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;//type casting
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(false)",up);
		
	}
}
