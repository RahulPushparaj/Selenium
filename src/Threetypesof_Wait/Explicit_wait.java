package Threetypesof_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\RAHUL\\Selenium\\Driverr\\chromedriver.exe");
		WebDriver push = new ChromeDriver();
		
		push.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement pass = push.findElement(By.id("identifierId"));
		
		WebDriverWait w =new WebDriverWait(push, 200);
		WebElement p = w.until(ExpectedConditions.elementToBeClickable(pass));
		p.sendKeys("bgfhjgdkj");
	}

}
