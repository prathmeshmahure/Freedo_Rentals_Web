package Freedo_domain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utility.base_class;
import com.utility.library;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_class extends base_class{


	@Test(enabled=true)
	public void test1() throws Exception {
		
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		Thread.sleep(4000);
		
		
		WebElement ele=driver.findElement(By.xpath("//button[@tabindex='0']"));
		library.Custom_click(ele, "chat");
		
		WebElement ele1=driver.findElement(By.xpath("//input[@id='tmcmu3t07aho1675331009285']"));
		library.custom_sendkeys(ele1, "Ganesh Digambar Mahure", "name");
		
		WebElement ele2=driver.findElement(By.xpath("//input[@id='h4mb9bfcjfbo1675331009287']"));
		library.custom_sendkeys(ele2, "mahureganesh123@gmail.com", "email");
		
		WebElement ele3=driver.findElement(By.xpath("//textarea[@role='textarea']"));
		library.custom_sendkeys(ele3, "Hello", "Message");
		
		WebElement ele4=driver.findElement(By.xpath("//i[@class='tawk-icon tawk-icon-mobile-send']"));
		library.Custom_click(ele4, "submit ");
		
	
	}
	
	@Test
	public void test2 () {
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
