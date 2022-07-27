package PopUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allow_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.fresherslive.com/online-test/aptitude-test/questions-and-answers");
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	}

	
}


