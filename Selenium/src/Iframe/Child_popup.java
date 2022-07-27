package Iframe;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://skpatro.github.io/demo/links/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value=\"New Tab\"]")).click();
	    Set<String> ids = driver.getWindowHandles();
	    ArrayList<String> al = new ArrayList<String>(ids);
	    String CWID = al.get(1);
	    driver.switchTo().window(CWID);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[text()=\"Training\"])[1]")).click();
	    driver.switchTo().window(al.get(0));
//	    3.149.59
	    
	 //   driver.findElement(By.xpath("//input[@name=\"NewWindow\"]")).click();
	    

	}

}
