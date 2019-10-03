package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver Rahul = new ChromeDriver();
		Rahul.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement source = Rahul.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement decigination = Rahul.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions a = new Actions(Rahul);
		a.dragAndDrop(source, decigination).perform();
		
	}

}
