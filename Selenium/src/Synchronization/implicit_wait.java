package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class implicit_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.w3schools.com/sql/");
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); // its old method of version 3.149.59 not support to updated selenium version
        //selenium 4
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("yyyy");
	    
	}

}
