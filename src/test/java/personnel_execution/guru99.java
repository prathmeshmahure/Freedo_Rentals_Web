package personnel_execution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru99 {
	
	@Test
	public void guru()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']"));
		
				
		for(WebElement element:list) {
			System.out.println(element.getText());
	
		}
	}

}
