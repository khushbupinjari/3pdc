package Practice;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Set_size {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		k.get("http://makeseleniumeasy.com/2017/08/18/part-1-handling-drop-down-created-using-select-tag-in-selenium/");
		System.out.println(k.manage().window().getSize());
	//	Dimension D = new Dimension(600,800);
	//	k.manage().window().setSize(D);
	//	Thread.sleep(5000);
//		Point E = new Point(300,400);
//		k.manage().window().setPosition(E);
		System.out.println(k.manage().window().getSize());
	
	}

}
