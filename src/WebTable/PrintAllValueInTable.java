package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllValueInTable 
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","D:\\praveen\\Rahul\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		for (WebElement x : rows)
		{
			List<WebElement> datas = x.findElements(By.tagName("td"));
			for (WebElement y : datas) 
			{
				String t = y.getText();
				System.out.println(t);
			}	
		}
	}
}
