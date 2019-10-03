package BaseClass;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseMethod 
{
	static WebDriver push;
	public static void launchBrowser(String url) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\chromedriver.exe");
		push = new ChromeDriver();
		Thread.sleep(3000);
		push.get(url);
	}
	public static void closeBrowser()
	{
		push.quit();
	}
	public static void type(WebElement e,String s)
	{
		e.sendKeys(s);
	}
	public static void click(WebElement e)
	{
		e.click();
	}
	public static void screenShot(String path) throws IOException
	{
		TakesScreenshot tk = (TakesScreenshot) push;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File descripition = new File(path);
		FileUtils.copyFile(source, descripition);
	}
	

}
