package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Min_max_page {

	      public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		  WebDriver k = new ChromeDriver();
		  k.get("https://www.upstox.com/");
		
		  Thread.sleep(5000);
	      k.manage().window().maximize();
	      
    	  Thread.sleep(5000);
    	  k.manage().window().minimize();
    	  
    	  Thread.sleep(5000);
    	  k.manage().window().maximize();
    	  
    	  Thread.sleep(5000);
    	  k.quit();
    	  
	}

}
