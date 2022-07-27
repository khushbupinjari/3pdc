package PopUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		    driver.findElement(By.xpath("//button[@name=\"promptalertbox1234\"]")).click();
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    Alert alt = driver.switchTo().alert();
            String text = alt.getText();
            System.out.println(text);
            Thread.sleep(2000);
            alt.sendKeys("Yes");
            alt.accept();
            Thread.sleep(2000);
            driver.close();
		    
		}

	}
