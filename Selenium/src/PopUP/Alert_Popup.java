package PopUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	    driver.findElement(By.xpath("//button[@name=\"alertbox\"]")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    
	//    WebDriverwait wait = new WebDriverWait();
	    
	    
	}
}
