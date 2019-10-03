package Threetypesof_Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver push = new ChromeDriver();
		
		push.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement pass = push.findElement(By.id("identifierId"));
		Wait w = new FluentWait(push).withTimeout(200, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
		Object o = w.until(ExpectedConditions.elementToBeClickable(pass));
		WebElement p = (WebElement)o;
		p.sendKeys("mcmcmcmcmcmcmc");
	}

}
