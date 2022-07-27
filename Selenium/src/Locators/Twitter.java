package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Twitter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Sign up with phone or email\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Khushbu");
		Thread.sleep(2000);
		driver.findElement(By.name("phone_number")).sendKeys("7507732173");
		Thread.sleep(2000);
		WebElement Birth = driver.findElement(By.xpath("(//select[@aria-invalid=\"false\"])[1]"));
		Select month = new Select(Birth);
		month.selectByVisibleText("January");
		
		
		
		 
		

	}

}
