package Scrrenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Forloop_Ss {

	public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
        Date date = new Date();
        System.out.println(date);
        date.toString().replace(" ","/").replace(":","-");
         
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    for(int i=1;i<=10;i++) {
	    	
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("D:\\Desktop\\Scrrenshots\\grp"+i+".jpg");
	    FileHandler.copy(source, dest);
	    
    
	    
	    } 
	        //driver.close();
	}

}
