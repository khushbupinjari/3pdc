package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gamil {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("khushbupinjari6@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		
		
		
		
	//	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("khushbupinjari0@gmail.com");
	//	driver.findElement(By.xpath("//input[contains(@type,\"email\")]")).sendKeys("khushbupinjari0@gmail.com");
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
	//	driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);


	}

}
