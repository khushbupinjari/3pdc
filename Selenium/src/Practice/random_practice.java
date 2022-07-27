package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class random_practice {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		k.get("http://www.amazon.in/");
		
		Thread.sleep(5000);
		
    	k.manage().window().maximize();
		
		WebElement search = k.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("apple 13 pro max");

		Thread.sleep(2000);
		
	
		WebElement search1 = k.findElement(By.id("nav-search-submit-button"));
		search1.click();
		Thread.sleep(2000);
		
		WebElement search2 = k.findElement(By.xpath("[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		search2.click();
		
		///k.quit();
		
		
		
		

	}

}
