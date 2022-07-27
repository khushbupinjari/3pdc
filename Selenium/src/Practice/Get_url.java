package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_url {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		  WebDriver k = new ChromeDriver();
		  k.get("https://www.saucedemo.com/");
		  
		  String url = k.getCurrentUrl();
		  System.out.println(url);
		  
		  k.close();

	}

}
