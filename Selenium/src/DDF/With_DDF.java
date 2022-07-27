package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file = new FileInputStream("D:\\Documents\\bearebel@6.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
	System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();      //upcasting
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	
	//Fetching data
	
	String UN = sh.getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(UN);
	Thread.sleep(2000);
	
	String PWD = sh.getRow(1).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(PWD);

    driver.close();
	}

}
