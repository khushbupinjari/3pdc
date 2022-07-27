package Scrrenshot;

import java.util.Date;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercedes_benz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tesla.com/");
		driver.manage().window().maximize();
        Thread.sleep(2000);
        
        Date date = new Date();
        System.out.println(date);
        date.toString().replace(" ","/").replace(":","-");
        
        
        
        
        
        
        
        
        
     //   WebElement Benz = driver.findElement(By.xpath("(//div[@class=\"tcl-homepage-hero__content-end\"])[1].jpg"));
  //      WebElement source = Benz.
        
        
        
     //   driver.findElement(By.xpath(""))
		
		
		
		
	}

}
