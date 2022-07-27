package Scrrenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	    
	    Date k = new Date();
	    System.out.println(k);
	    String j = k.toString().replace(" ", "_").replace(":","-");
	    
	    FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), 
	    		new File("D:\\Desktop\\Scrrenshots\\"+j+".jpg"));
	}
}
