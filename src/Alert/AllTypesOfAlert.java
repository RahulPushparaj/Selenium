package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTypesOfAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver Rahul = new ChromeDriver();
		Rahul.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Rahul.switchTo().frame("iframeResult");
		Rahul.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert a= Rahul.switchTo().alert();
		Thread.sleep(4000);
		a.accept();
		
		//a.dismiss();
		
		//a.sendKeys("ghgdf");
		//a.accept();
	}

}
