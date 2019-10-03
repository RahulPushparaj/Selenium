package WindowsHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AchiveWindowsHandlingToList 
{
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://netbanking.canarabank.in/entry/ENULogin.jsp?");
		Thread.sleep(3000);
		d.findElement(By.id("fldLoginUserId")).sendKeys("RahulPushparaj");
		d.findElement(By.id("fldPassword")).sendKeys("123456789");
		d.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		Thread.sleep(9000);
		//get parent class
		String h = d.getWindowHandle();
		System.out.println(h);
		//get child class
		Set<String> hs = d.getWindowHandles();
		System.out.println(hs);
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.addAll(hs);
		System.out.println("Total List=="+arrayList);
		d.switchTo().window(arrayList.get(1));
		d.findElement(By.name("fldSubmit")).click();
	}

}
