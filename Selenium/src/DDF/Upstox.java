package DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Upstox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		ChromeOptions kbp = new ChromeOptions();
		kbp.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(kbp);
		driver.get("https://login.upstox.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("7507732173");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=\"Get OTP\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Continue\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("750773");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@src=\"/assets/old_logo_choose.svg\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
