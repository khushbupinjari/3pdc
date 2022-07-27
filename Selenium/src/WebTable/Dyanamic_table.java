package WebTable;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		Thread.sleep(2000);
		 List<WebElement> noofrow = driver.findElements(By.xpath("//tbody/tr"));
		System.out.println("number of rows = "+noofrow.size());
		
		List<WebElement> data = driver.findElements(By.xpath("/html/body/table/tbody/tr/td"));
		System.out.println("Total number of data present ="+data.size()+"data present at 5 :"+data.get(5).getText()+" | ");
		for( int i=0;i<data.size();i++) {
			System.out.println(data.get(i).getText()+" | ");
		}
	
//		List<WebElement> noofcell = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td"));
//		System.out.println("number of columns = "+noofcell.size());
//		for(int i=1;i<noofrow.size();i++) {
//			for(int j=1;j<driver.findElements(By.xpath("/html/body/table/tbody/tr["+i+"]/td")).size();j++) {
//			 String data1 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
//				System.out.println(data1+" | ");
//			}
//			System.out.println();
//		}

	}

}
