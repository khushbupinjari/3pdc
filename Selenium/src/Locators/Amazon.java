package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	    
	    

	}

}
