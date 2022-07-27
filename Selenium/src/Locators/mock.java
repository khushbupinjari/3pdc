package Locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[starts-with(@class,'L0Z3Pu')]")).click();  // submit button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-id=\"MOBGE2KY6JUTSNCP\"]")).click();
		Thread.sleep(3000);
     	Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.xpath("//input[@id=\"pincodeInputId\"]")).sendKeys("424005");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"pincodeInputId\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(7000);
		driver.findElement(By.xpath("//button[text()=\"BUY NOW\"]")).click();

	}

}
