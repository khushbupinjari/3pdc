package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email_pass_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		k.get("http://www.facebook.com/");
		
		k.manage().window().maximize();
		
		WebElement email = k.findElement(By.id("email"));
		email.sendKeys("khushbupinjari6@gmail.com");
		
		WebElement pass = k.findElement(By.name("pass"));
		pass.sendKeys("1234567");
		
		WebElement login = k.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(10000);
		
		WebElement gmail = k.findElement(By.xpath("//*[@id=\"loginform\"]/div[4]/div/a"));
		gmail.click();
		k.quit();
	}

}
