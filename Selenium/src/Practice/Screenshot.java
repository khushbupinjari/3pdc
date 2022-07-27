package Practice;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		
    //	Date date = new Date();
	//    date.getTime();
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rolls-roycemotorcars.com/en_US/showroom/ghost.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='No thanks']")).click();

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String random =RandomString.make(5);
		File dest = new File("D:\\Desktop\\Scrrenshots\\grp"+random+".jpg");
		FileHandler.copy(source, dest);

	}

}
