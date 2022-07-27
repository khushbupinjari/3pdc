package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Isselect {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=\"Sign up for Facebook\"]")).click();
	
    	WebElement month =driver.findElement(By.xpath("//select[@title=\"Month\"]"));
    	Select s = new Select(month);
    	s.getFirstSelectedOption();
		
	
	

	}
}
