package Scrrenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("D:\\Desktop\\Scrrenshots\\grp.1.jpg");
	    FileHandler.copy(source, dest);
	//    FileHandler.copy(source, dest);
	    driver.close();
	    
	    

	}

}
