package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueDropDown 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ\\SELENIUMM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement M = driver.findElement(By.id("selenium_commands"));
		Select S = new Select(M);
		boolean mul = S.isMultiple();
		System.out.println(mul);
		System.out.println("Get Options");
		List<WebElement> O = S.getOptions();
		for (WebElement getoption : O) 
		{
			String text = getoption.getText();
			if(text.equals("Browser Commands")||text.equals("Navigation Commands")||text.equals("Switch Commands"))
				{
					S.selectByVisibleText(text);
					System.out.println("ANSWER="+text);
				}
			System.out.println(text);
		}
	}
}
