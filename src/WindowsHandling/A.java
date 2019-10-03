package WindowsHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{
	public static void main(String[] args) throws InterruptedException 
	{
		int c = 0;
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\SELENIUMM\\Driverr\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://netbanking.canarabank.in/entry/ENULogin.jsp?");
		d.findElement(By.id("fldLoginUserId")).sendKeys("RahulPushparaj");
		d.findElement(By.id("fldPassword")).sendKeys("123456789");
		d.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		
		String pw = d.getWindowHandle();
		System.out.println(pw);
		Set<String> aw = d.getWindowHandles();
		System.out.println(aw);
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.addAll(aw);
		System.out.println(arrayList);
		String s = arrayList.get(1);
		System.out.println(s);
		d.switchTo().window(s);
		d.findElement(By.name("fldSubmit")).click();
		Thread.sleep(2000);
		d.quit();
	}

}
