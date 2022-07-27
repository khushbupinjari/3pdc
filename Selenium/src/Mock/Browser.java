package Mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\browser\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\browser\\msdedgedriver.exe");
	//	ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
	//	EdgeDriver driver = new EdgeDriver();
  //      WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		

	}

}
