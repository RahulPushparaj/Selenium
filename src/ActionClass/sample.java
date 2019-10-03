package ActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\Rahul\\Driver\\chromedriver.exe");
		WebDriver R = new ChromeDriver();
		R.get("http://www.greenstechnologys.com/");
		R.manage().window().maximize();
		String tittle=R.getTitle();
		System.out.println(tittle);
		String url=R.getCurrentUrl();
		System.out.println(url);
		
		
	}

}
