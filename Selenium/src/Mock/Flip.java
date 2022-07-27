package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[@class=\"_14Me7y\"]")).click();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("7507732173");
	//	driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Khush@123");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone 13 pro max");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	//	WebElement scroll = driver.findElement(By.xpath("\"//html[@lang=\\\"en\\\"]\""));
	//	Select kp = new Select(scroll);
	//	kp.
		
		
		

	}

}
