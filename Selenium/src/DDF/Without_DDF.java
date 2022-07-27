package DDF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Without_DDF {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		ChromeOptions kbp = new ChromeOptions();
		kbp.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(kbp);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("VZP835");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Khush@123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("750773");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Actions act = new Actions(driver);
		WebElement share  = driver.findElement(By.xpath("//span[text()='GOLDBEES']"));
		act.moveToElement(share).perform();
		WebElement buy = driver.findElement(By.xpath("//button[text()='B ']"));
		act.moveToElement(buy).click();
		act.perform();
		
		//validation of user Id
		String ActualUID = driver.findElement(By.xpath("//span[@class=\"user-id\"]")).getText();
		String expectedUID = "VZP835";
		
		if(expectedUID.equals(ActualUID)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
