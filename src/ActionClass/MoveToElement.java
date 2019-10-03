


package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver Rahul = new ChromeDriver();
		Rahul.get("http://www.greenstechnologys.com");
		WebElement cou = Rahul.findElement(By.xpath("//a[text()='COURSES']"));
		WebElement orc = Rahul.findElement(By.xpath("//span[text()='Oracle Training']"));
		WebElement dba = Rahul.findElement(By.xpath("//span[text()='Oracle DBA Training']"));
		Actions a = new Actions(Rahul);
		
		//MOVETOEMELEMT
		//USES it is used to inner------>inner---->inner---->inner---->click
		a.moveToElement(cou).perform();
		a.moveToElement(orc).perform();
		dba.click();
	}
}
