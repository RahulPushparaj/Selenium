   package Threetypesof_Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implecite_Wait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver push = new ChromeDriver();
		
		push.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		push.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		push.findElement(By.id("identifierId")).sendKeys("rahulpush851@gmail.com");
		push.findElement(By.id("identifierNext")).click();
		push.findElement(By.name("password")).sendKeys("ghgjihdfogkidfih");
		push.findElement(By.id("passwordNext")).click();
		
		
	}
}
