package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		k.get("http://www.facebook.com/");
	
		k.navigate().to("http://www.amazon.com/");
		
		k.close();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://instagram.com/");
		
		driver1.quit();
		
		
		
		
		
		
		
		
		
		

	}

}
