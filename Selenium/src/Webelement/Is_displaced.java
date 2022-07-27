package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_displaced {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=\"Custom\"]")).click();
		Thread.sleep(2000);
		WebElement result =driver.findElement(By.xpath("//select[@aria-label=\"Select your pronoun\"]"));
		boolean display = result.isSelected();
	    System.out.println(display);
		

	}

}
