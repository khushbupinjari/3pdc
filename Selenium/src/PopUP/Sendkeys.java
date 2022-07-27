package PopUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("RCV");
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("RCV");
		alt.accept();
        driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	}

	
	
	
	
	
	
	
	
	
	
	

}
