package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Last_Two_Table
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\praveen\\Rahul\\Driver\\chromedriver.exe");
		WebDriver A = new ChromeDriver();
		A.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> row = A.findElements(By.tagName("tr")); 
		for(int i =4;i<row.size();i++)
		//for(int i =row.size()-1;i>=4;i--)
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
