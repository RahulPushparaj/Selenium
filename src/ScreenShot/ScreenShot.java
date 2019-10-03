package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		//type casting
		TakesScreenshot tk = (TakesScreenshot)driver;
		//Temparory folder cerate
		//this line is mandatory
		File src = tk.getScreenshotAs(OutputType.FILE);
		//set the path for desk
		File dec = new File("D:\\SCREENSHOT RAHUL\\greens.jpeg");
		//copy images from temporary to our folder
		FileUtils.copyFile(src, dec);
	}
}
