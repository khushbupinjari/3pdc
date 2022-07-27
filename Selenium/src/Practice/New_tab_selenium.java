package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_tab_selenium {


		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
			
			WebDriver k = new ChromeDriver();
			k.get("http://www.instagram.com/");
			k.switchTo().newWindow(WindowType.TAB);
			k.get("https://web.telegram.org/z/");

		}

	}


