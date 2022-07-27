package Locators;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Locator {

	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("Mobile");
     	driver.findElement(By.xpath("//button[starts-with(@class,'L0Z3Pu')]")).click();  // submit button
    	Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-id='MOBGE2KY6JUTSNCP']")).click();
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"pincodeInputId\"]")).sendKeys("411002");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"pincodeInputId\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class =\"_2KpZ6l _2U9uOA ihZ75k _3AWRsL\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
//		driver.findElement(By.xpath("//button[text()=\"Buy NOW\"]")).click();
		
		driver.switchTo().window(parentID);
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}
      
}
