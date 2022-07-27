package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_testing {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String exptitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
				
		  if(title.equalsIgnoreCase(exptitle)) {
			  System.out.println("Fixed");
		  }
		  else {
			  System.out.println("Bug");
		  }
	}

}
