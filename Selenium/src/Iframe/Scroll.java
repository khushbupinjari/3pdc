package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://browser//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement iframe =driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		Actions scroll = new Actions(driver);
		scroll.moveToElement(iframe).perform();

	}

}
