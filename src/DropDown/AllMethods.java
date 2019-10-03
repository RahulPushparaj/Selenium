package DropDown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllMethods 
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
		System.out.println("GetOptions");
		List<WebElement> O = S.getOptions();
		System.out.println(O);
		for (WebElement getopt : O) 
		{
			String text = getopt.getText();
			if(text.equals("Browser Commands")||text.equals("Navigation Commands")||text.equals("Switch Commands"))
				{
					S.selectByVisibleText(text);
				}
			System.out.println(text);
		}
		System.out.println();
		System.out.println("Get All Selected Options");
		List<WebElement> allopt = S.getAllSelectedOptions();
		for (WebElement getallapt : allopt) {
		String te = getallapt.getText();
		System.out.println(te);
		}
		System.out.println();
		System.out.println("Get First Selected Options");
		WebElement first = S.getFirstSelectedOption();
		String tex = first.getText();
		System.out.println(tex);
		S.deselectByIndex(0);
	}
}   
