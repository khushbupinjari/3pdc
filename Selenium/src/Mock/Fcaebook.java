package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fcaebook {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=\"Sign up for Facebook\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("Khush");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Pinjari");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("pinjari");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("khushbupinjari@gmail.com");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("khushbupinjari@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Nothing@123");
		Thread.sleep(2000);
		
	    WebElement Custom = driver.findElement(By.xpath("//input[@name=\\\"custom_gender\\\"]"));
	    Custom.click();	
	    boolean disply = Custom.isDisplayed();
	    System.out.println(disply);
	//    driver.findElement(By.xpath("//input[@name=\"custom_gender\"]")).sendkeys("kkk");
	    
	//   if(result==true) {
		   System.out.println("Selected");
	//   }
	//   else {
	//	   System.out.println("disabled");
	   }

	}


