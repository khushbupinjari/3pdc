package Scrrenshot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class random {

void xyz() throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rolls-roycemotorcars.com/en_US/showroom/ghost.html");
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("D:\\Desktop\\Scrrenshots\\kp.jpg");
	FileHandler.copy(source, dest);

	}

}
