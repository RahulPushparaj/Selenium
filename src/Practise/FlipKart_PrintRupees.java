package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_PrintRupees 
{
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		d.findElement(By.name("q")).sendKeys("redmi");
		d.findElement(By.xpath("//button[@class='vh79eN']")).click();
		WebElement z = d.findElement(By.xpath("(//li[text()='Qualcomm Snapdragon 439 Processor'])[1]"));
		String c = z.getText();
		System.out.println(c);	
	}
}
//div[@class='_3wU53n']
//(//li[text()='Qualcomm Snapdragon 439 Processor'])[1]