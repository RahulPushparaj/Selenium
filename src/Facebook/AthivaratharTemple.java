package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AthivaratharTemple 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\praveen\\Rahul\\Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://tnhrce.gov.in/eservices/archanaiticket_collection.php?tid=1864&catcode=0");
	
		driver.findElement(By.xpath("(//span[@style='font-size:1em;'])[8]")).click();
		driver.findElement(By.id("btnbook1")).click();
		
		driver.findElement(By.xpath("//span[text()='Add']")).click();
		driver.findElement(By.xpath("//span[text()='Add']")).click();
		driver.findElement(By.xpath("//span[text()='Add']")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("malathi");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("491910959708");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("45");
		
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("anushya");
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("956328952508");
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("21");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("sakthiraj");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("897290255178");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("26");
		
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("anitha");
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("323555769677");
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("23");
		
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("7/7");
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("sholinganallur");
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("chennai");
		driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("600119");
		
		driver.findElement(By.xpath("(//input[@type='text'])[16]")).sendKeys("pushparajrahulshanthi851@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("9962083658");
	}

}
