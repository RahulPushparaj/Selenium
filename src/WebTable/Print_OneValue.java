package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_OneValue
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		for (WebElement x : rows)
		{
			List<WebElement> data = x.findElements(By.tagName("td"));
			for (WebElement y : data) 
			{
				String t = y.getText();
				if(t.equals("Dubai"))
				{
				System.out.println(t);
				}	
			}
		}
	}

}
