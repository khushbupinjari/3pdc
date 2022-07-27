package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		driver.findElement(By.name("enter-name")).sendKeys("Velocity");
		Thread.sleep(2000);
		driver.findElement(By.name("enter-name")).clear();
		System.out.println("class name of open tab button:"+driver.findElement(By.id("opntab")).getAttribute("class"));
		
		
		
		
		
		
	}

}
