package Practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Scrollup_ScrollDown
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\praveen\\Rahul\\Driver\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement d = c.findElement(By.xpath("//p[text()='1) Explain about Ur project , in that Ur roles and responsibilities']"));
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)c;
		js.executeScript("arguments[0].scrollIntoView(true)",d);
		TakesScreenshot tk = (TakesScreenshot)d;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dec = new File("C:\\Users\\7.DESKTOP-PHPVAIG\\Desktop\\New folder (2)\\3.jpeg");
		FileUtils.copyFile(src, dec);                                                                                                                                                
		
		
	}

}
