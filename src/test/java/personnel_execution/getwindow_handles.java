package personnel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getwindow_handles {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("");
	driver.manage().window().maximize();
	
	String parentwindow=driver.getWindowHandle();
			driver.switchTo().window(parentwindow);
	
	
	
	
	
	}
}
