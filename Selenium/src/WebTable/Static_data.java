package WebTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Static_data {


			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "c://browser//chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://cosmocode.io/automation-practice-webtable/");
				driver.findElement(By.xpath("(//input[@class=\"hasVisited\"])[1]")).click();
				
				
//				get number of rows present in webtable
				int rows = driver.findElements(By.xpath("(//table[@id='countries']//tr)")).size();
				System.out.println("Total number of Rows : " + rows);

//			    get number of columns present in webtable
		        int columns = driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
				System.out.println("Total number of Columns : " + columns);

//				retrive the specific cell data
				String celldata = driver.findElement(By.xpath("(//table[@id='countries']//tr[78])/td[1]")).getText();
				System.out.println("Data of the cell : " + celldata);
				
//			    retrive all data from the table
				for (int i = 1; i < rows; i++) {

					for (int j = 1; j <= driver.findElements(By.xpath("//table[@id='countries']//tr[" + i + "]//td"))
							.size(); j++) {
						String s = driver.findElement(By.xpath("(//table[@id='countries']//tr[" + i + "])/td[" + j + "]"))
								.getText();
						
						  int count = 0;
						  if(s == driver.findElement(By.xpath("(//table[@id='countries']//tr[" + i + "])/td[1]")).getText()) {
							  
							System.out.println(count);
							  count++;
						  }
						  
						System.out.print(s + " | ");
					}
					System.out.println();
				}
					
	
   }


}









