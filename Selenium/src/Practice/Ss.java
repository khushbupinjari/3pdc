package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss {

	public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		k.get("http://www.facebook.com/");

	}

}
