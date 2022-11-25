package personnel_execution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class print_all_list {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total list = "+list.size());
		
		for(WebElement el:list) {
			System.out.println(el.getText());
		
			
			if(el.getText().equals("Retirement Calculator")){
				el.click();
			}
			else {
				
			}
		}
		
		driver.close();
	}

}
