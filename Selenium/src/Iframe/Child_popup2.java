package Iframe;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/sql/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[@target=\"_blank\"])[45]")).click();
	    Set<String> ids = driver.getWindowHandles();
	    ArrayList<String> al = new ArrayList<String>(ids);
	    String CWID = al.get(1);
	    driver.switchTo().window(CWID);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class=\"ws-btn\"]")).click();
	    driver.switchTo().window(al.get(0));
        driver.findElement(By.xpath("//a[text()=\"CSS\"]")).click();
	}

}
