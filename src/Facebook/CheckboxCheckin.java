package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxCheckin 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("OUTPUT");
		WebElement btn = driver.findElement(By.id("loginbutton"));
		boolean displayed = btn.isDisplayed();
		System.out.println("Isdisplayed="+displayed);
		boolean enabled = btn.isEnabled();
		System.out.println("Isenabled="+enabled);
		WebElement A = driver.findElement(By.xpath("//input[@value='1']"));
		A.click();
		boolean selected = A.isSelected();
		System.out.println("Iselected="+selected);
	}
	
}
