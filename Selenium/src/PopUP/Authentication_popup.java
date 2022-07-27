package PopUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Authentication_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();             // By using this way we can handle authentication pop up
	    opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
	    driver.get("https://www.fresherslive.com/online-test/aptitude-test/questions-and-answers");
//	    driver.findElement(By.xpath("//button[@name=\"alertbox\"]")).click();
//	    Thread.sleep(2000);
//	    driver.switchTo().alert().dismiss();
//	    

	}

}
