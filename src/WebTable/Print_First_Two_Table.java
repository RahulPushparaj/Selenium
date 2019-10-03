package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_First_Two_Table
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver A = new ChromeDriver();
		A.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> row = A.findElements(By.tagName("tr")); 
		for(int i =2;i<row.size()-2;i++)
		{
			List<WebElement> coloum = row.get(i).findElements(By.tagName("td"));
			
			for(int j = 0;j<coloum.size();j++)
			{
				String t = coloum.get(j).getText();
				System.out.println(t);
			}
		}
	}
}