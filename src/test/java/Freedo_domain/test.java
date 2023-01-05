package Freedo_domain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://adminuat.freedo.rentals/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='userName']"));
		ele.click();
		ele.sendKeys("admin");
		WebElement el=driver.findElement(By.xpath("//input[@id='password']"));
		driver.findElement(By.xpath("//button[@title='SUBMIT']")).click();
		el.click();
		el.sendKeys("admin");
		
		driver.findElement(By.xpath("//p[text()='Statistics']")).click();

	}

}
