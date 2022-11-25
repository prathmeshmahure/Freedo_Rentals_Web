package Merlin_domain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.base_class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_0002  {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']"));
		
		
		for(WebElement element:list) {
			String s=element.getText();
		
			System.out.println(element.getText());
			
				
	}

}
}
