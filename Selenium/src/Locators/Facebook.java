package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ISelect;
//import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("Khush");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Pinjari");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("khushbupinjari@gmail.com");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("khushbupinjari@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Nothing@123");
      
	//	WebElement birth = driver.findElement(By.xpath("//select[@id=\"day\"]"));
	//	Facebook day = new Facebook(birth);
	//	((ISelect) day).selectByIndex("6");
	}

}
