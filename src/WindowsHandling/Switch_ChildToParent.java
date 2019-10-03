package WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_ChildToParent 
{
	public static void main(String[] args) throws InterruptedException  
	{
		int c= 0;
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://netbanking.canarabank.in/entry/ENULogin.jsp?");
		Thread.sleep(3000);
		d.findElement(By.id("fldLoginUserId")).sendKeys("RahulPushparaj");
		d.findElement(By.id("fldPassword")).sendKeys("123456789");
		d.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		//get parent class
		String h = d.getWindowHandle();
		System.out.println(h);
		//get child class
		Set<String> hs = d.getWindowHandles();
		System.out.println(hs);
		for (String ok : hs) 
		{
			if(c==1)
			{
				d.switchTo().window(ok);
			}
			c++;
		}
		d.findElement(By.name("fldSubmit")).click();
	
		d.switchTo().defaultContent();
	}
}
